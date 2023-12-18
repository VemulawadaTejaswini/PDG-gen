import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static final int PANEL_SIZE = 8;
	static PrintStream out = System.out;

	public static final boolean MAMI = true;
	public static final boolean CHARROTTE = false;

	public static void main(String[] args) {
		write(new Main(read()).solve());
	}

	static Boolean[][] read() {
		Boolean[][] boad = new Boolean[PANEL_SIZE][PANEL_SIZE];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < PANEL_SIZE; i++) {
			char[] row = sc.nextLine().toCharArray();
			for (int j = 0; j < PANEL_SIZE; j++) {
				boad[i][j] = charToBool(row[j]);
			}
		}
		sc.close();
		return boad;
	}

	static void write(Boolean[][] boad) {
		for (int i = 0; i < PANEL_SIZE; i++) {
			for (int j = 0; j < PANEL_SIZE; j++) {
				out.print(boolToChar(boad[i][j]));
			}
			out.println();
		}
	}

	private static char boolToChar(Boolean bool) {
		if (bool == null) {
			return '.';
		} else if (bool) {
			return 'o';
		} else {
			return 'x';
		}
	}

	private static Boolean charToBool(char panel) {
		switch (panel) {
		case 'o':
			return true;
		case 'x':
			return false;
		default:
			return null;
		}
	}

	private Boolean[][] boad;
	boolean player = MAMI;

	public DessertWitch(Boolean[][] boad) {
		this.boad = boad;
	}

	public Boolean[][] solve() {
		Boolean[][] nextBoad;
		int passCount = 0;
		do {
			nextBoad = next();
			if (nextBoad == null) {
				passCount++;
			} else {
				passCount = 0;
			}
		} while (passCount < 2);
		return boad;
	}

	protected Boolean[][] next() {
		Boolean[][] nextBoad = null;
		int maxScore = 0;
		for (int i = 0; i < PANEL_SIZE; i++) {
			for (int j = 0; j < PANEL_SIZE; j++) {
				if (boad[i][j] == null) {
					Coordinate coordinate = new Coordinate(j, i);
					int score = getScore(coordinate);
					if (maxScore < score || (player == CHARROTTE && maxScore == score && maxScore > 0)) {
						maxScore = score;
						nextBoad = nextBoad(coordinate);
					}
				}
			}
		}
		boad = nextBoad == null ? boad : nextBoad;
		player = !player;
		return nextBoad;
	}

	Boolean[][] nextBoad(Coordinate coordinate) {
		if (boad[coordinate.y][coordinate.x] != null) {
			return boad;
		}

		Set<Coordinate> panels = stepFunctions.stream()
				.flatMap(stepFunction -> getReversiblePanels(stepFunction, coordinate)).collect(Collectors.toSet());
		panels.add(coordinate);

		Boolean[][] nextBoad = copyBoad();
		for (Coordinate panel : panels) {
			nextBoad[panel.y][panel.x] = player;
		}

		return nextBoad;
	}

	Stream<Coordinate> getReversiblePanels(Function<Coordinate, Optional<Coordinate>> stepFunction,
			Coordinate startPos) {
		Coordinate tempPos = startPos;
		Set<Coordinate> tempPanels = new HashSet<>();
		while (true) {
			tempPos = stepFunction.apply(tempPos).orElse(null);
			if (tempPos == null || boad[tempPos.y][tempPos.x] == null) {
				return Stream.empty();
			} else if (boad[tempPos.y][tempPos.x] == player) {
				return tempPanels.stream();
			} else {
				tempPanels.add(tempPos);
			}
		}
	}

	int getScore(Coordinate coordinate) {
		if (boad[coordinate.y][coordinate.x] != null) {
			return 0;
		}
		return stepFunctions.stream().mapToInt(function -> getScore(function, coordinate)).sum();
	}

	int getScore(Function<Coordinate, Optional<Coordinate>> stepFunction, Coordinate startPos) {
		int tempScore = 0;
		Coordinate tempPos = startPos;
		while (true) {
			tempPos = stepFunction.apply(tempPos).orElse(null);
			if (tempPos == null || boad[tempPos.y][tempPos.x] == null) {
				return 0;
			} else if (boad[tempPos.y][tempPos.x] == player) {
				return tempScore;
			} else {
				tempScore++;
			}
		}
	}

	Boolean[][] copyBoad() {
		Boolean[][] nextBoad = new Boolean[PANEL_SIZE][PANEL_SIZE];
		for (int i = 0; i < PANEL_SIZE; i++) {
			for (int j = 0; j < PANEL_SIZE; j++) {
				nextBoad[i][j] = boad[i][j];
			}
		}
		return nextBoad;
	}

	static Function<Coordinate, Optional<Coordinate>> toTopLeft = coordinate -> coordinate.x > 0 && coordinate.y > 0
			? Optional.of(new Coordinate(coordinate.x - 1, coordinate.y - 1))
			: Optional.empty();
	static Function<Coordinate, Optional<Coordinate>> toTop = coordinate -> coordinate.y > 0
			? Optional.of(new Coordinate(coordinate.x, coordinate.y - 1))
			: Optional.empty();
	static Function<Coordinate, Optional<Coordinate>> toTopRight = coordinate -> coordinate.x < PANEL_SIZE - 1
			&& coordinate.y > 0 ? Optional.of(new Coordinate(coordinate.x + 1, coordinate.y - 1)) : Optional.empty();

	static Function<Coordinate, Optional<Coordinate>> toLeft = coordinate -> coordinate.x > 0
			? Optional.of(new Coordinate(coordinate.x - 1, coordinate.y))
			: Optional.empty();
	static Function<Coordinate, Optional<Coordinate>> toRight = coordinate -> coordinate.x < PANEL_SIZE - 1
			? Optional.of(new Coordinate(coordinate.x + 1, coordinate.y))
			: Optional.empty();

	static Function<Coordinate, Optional<Coordinate>> toBottomLeft = coordinate -> coordinate.x > 0
			&& coordinate.y < PANEL_SIZE - 1 ? Optional.of(new Coordinate(coordinate.x - 1, coordinate.y + 1))
					: Optional.empty();
	static Function<Coordinate, Optional<Coordinate>> toBottom = coordinate -> coordinate.y < PANEL_SIZE - 1
			? Optional.of(new Coordinate(coordinate.x, coordinate.y + 1))
			: Optional.empty();
	static Function<Coordinate, Optional<Coordinate>> toBottomRight = coordinate -> coordinate.x < PANEL_SIZE - 1
			&& coordinate.y < PANEL_SIZE - 1 ? Optional.of(new Coordinate(coordinate.x + 1, coordinate.y + 1))
					: Optional.empty();
	static List<Function<Coordinate, Optional<Coordinate>>> stepFunctions = Arrays.asList(toTopLeft, toTop, toTopRight,
			toLeft, toRight, toBottomLeft, toBottom, toBottomRight);

	static class Coordinate {
		int x, y;

		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return String.format("[%d, %d]", x, y);
		}
	}

}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Map map;
	static ArrayList<String> printList = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dataSetsCount = Integer.parseInt(sc.nextLine());
		for (int count = 0; count < dataSetsCount; count++) {

			String[] input = sc.nextLine().split("[\\s]+");
			map = new Map(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
			input = new String[map.height];
			for (int i = 0; i < map.height; i++) {
				input[i] = sc.nextLine();
			}
			map.InputMapDate(input);

			int actionCount = Integer.parseInt(sc.nextLine());
			String[] actionLine = sc.nextLine().split("");
			for (int i = 0; i < actionCount; i++) {
				map.tank.ExecuteAction(ActionType.valueOf(actionLine[i]));
			}

			Print();
			if (count < dataSetsCount - 1)
				printList.add("\n");
		}
		for (String str : printList) {
			System.out.print(str);
		}
	}

	static void Print() {

		for (int y = 0; y < map.height; y++) {
			String str = "";
			for (int x = 0; x < map.width; x++) {
				if (map.tank.Y == y && map.tank.X == x) {
					str += map.tank.State.str;
				} else {
					Tile t = map.getTile(x, y);
					str += t.Type.str;
				}
			}
			str += "\n";
			printList.add(str);
		}
	}

	enum TileType {
		Field("."), Brick("*"), Iron("#"), Water("-");
		String str;

		TileType(String str) {
			this.str = str;
		}
	}

	static class Tile {
		TileType Type;
		int X;
		int Y;

		Tile(int x, int y, TileType type) {
			this.X = x;
			this.Y = y;
			this.Type = type;
		}
	}

	enum ActionType {
		U("Up"), D("Down"), L("Left"), R("Right"), S;

		TankState ts;

		ActionType() {

		}

		ActionType(String str) {
			this.ts = TankState.valueOf(str);
		}
	}

	enum TankState {
		Up("^", 0, -1), Down("v", 0, 1), Right(">", 1, 0), Left("<", -1, 0);
		String str;
		int x;
		int y;

		TankState(String str, int x, int y) {
			this.str = str;
			this.x = x;
			this.y = y;
		}
	}

	static class Tank {
		TankState State;
		int X;
		int Y;

		Tank(int x, int y, TankState state) {
			this.X = x;
			this.Y = y;
			this.State = state;
		}

		void ExecuteAction(ActionType action) {
			if (action == ActionType.S) {
				this.Shoot();
			} else {
				if (map.MobilityCheck(this.X + action.ts.x, this.Y + action.ts.y)) {
					this.X += action.ts.x;
					this.Y += action.ts.y;
				}
				this.State = action.ts;
			}
		}

		void Shoot() {
			int x = this.X;
			int y = this.Y;
			Tile tile = map.getTile(x, y);
			while (tile != null && (tile.Type == TileType.Field || tile.Type == TileType.Water)) {
				x += this.State.x;
				y += this.State.y;
				tile = map.getTile(x, y);
			}
			if (tile != null && tile.Type == TileType.Brick) {
				map.BreakBrickTile(x, y);

			}
		}
	}

	static class Map {
		ArrayList<Tile> tileList = new ArrayList<Tile>();

		int height;
		int width;
		Tank tank;

		Map(int height, int width) {
			this.height = height;
			this.width = width;
		}

		Tile getTile(int x, int y) {
			for (Tile t : tileList) {
				if (t.X == x && t.Y == y) {
					return t;
				}
			}
			return null;
		}

		void BreakBrickTile(int x, int y) {
			int i = 0;
			for (Tile t : tileList) {

				if (t.X == x && t.Y == y) {
					tileList.set(i, new Tile(x, y, TileType.Field));
				}
				i++;
			}
		}

		void InputMapDate(String[] str) {
			for (int y = 0; y < height; y++) {
				String[] line = str[y].split("");
				for (int x = 0; x < width; x++) {

					TileType tt = TileDiscrimination(line[x]);
					if (tt != null) {
						tileList.add(new Tile(x, y, tt));
					} else {
						TankState ts = TankDiscrimination(line[x]);
						if (ts != null) {
							this.tank = new Tank(x, y, ts);
							tileList.add(new Tile(x, y, TileType.Field));
						}
					}
				}
			}
		}

		TileType TileDiscrimination(String str) {
			for (TileType tt : TileType.values()) {
				if (tt.str.equals(str)) {
					return tt;
				}
			}
			return null;
		}

		TankState TankDiscrimination(String str) {
			for (TankState ts : TankState.values()) {
				if (ts.str.equals(str)) {
					return ts;
				}
			}
			return null;
		}

		boolean MobilityCheck(int x, int y) {
			Tile t = getTile(x, y);
			if (t != null && t.Type == TileType.Field) {
				return true;
			}
			return false;
		}
	}
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List<Triangle> triangleList = new ArrayList<>();
		while (stdIn.hasNextInt()) {
			triangleList.add(new Triangle(stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt()));
		}

		Counter c = new Counter(triangleList);
		stdIn.close();

		System.out.println(c.countLegalTriangle() + " " + c.countTriangle(TriangleType.RIGHT) + " "
				+ c.countTriangle(TriangleType.ACUTE_ANGLED) + " " + c.countTriangle(TriangleType.OBTUSE_ANGLED));
	}
}

class Counter {
	private Map<TriangleType, Integer> countMap = new EnumMap<>(TriangleType.class);

	public Counter(List<Triangle> triangleList) {
		for (Triangle triangle : triangleList) {
			try {
				add(triangle);
			} catch (IllegalArgumentException e) {
				break;
			}
		}
	}

	private void add(Triangle t) {
		TriangleType type = Triangle.secern(t);

		if (!countMap.containsKey(type)) {
			countMap.put(type, 1);
			return;
		}
		countMap.replace(type, countMap.get(type) + 1);
	}

	public int countLegalTriangle() {
		return countMap.entrySet().stream().filter(e -> e.getKey() != TriangleType.ILLEGAL).mapToInt(e -> e.getValue())
				.sum();
	}

	public long countTriangle(TriangleType t) {
		return countMap.entrySet().stream().filter(e -> e.getKey() == t).mapToInt(e -> e.getValue()).sum();
	}
}

class Triangle {
	private int first;
	private int second;
	private int third;

	public Triangle(int first, int second, int third) {
		int[] edges = { first, second, third };

		Arrays.sort(edges);
		// sorted
		this.first = edges[0];
		this.second = edges[1];
		this.third = edges[2];
	}

	public static boolean isTriangle(Triangle t) {
		return t.first + t.second > t.third;
	}

	public static TriangleType secern(Triangle t) {
		if (t == null) {
			throw new IllegalArgumentException("null NG");
		}

		if (!isTriangle(t)) {
			throw new IllegalArgumentException("null NG");
		}

		int former = t.first * t.first + t.second * t.second;
		int latter = t.third * t.third;

		if (former == latter) {
			return TriangleType.RIGHT;
		}

		return former > latter ? TriangleType.ACUTE_ANGLED : TriangleType.OBTUSE_ANGLED;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	public int getThird() {
		return third;
	}

	@Override
	public String toString() {
		return "Triangle [first=" + first + ", second=" + second + ", third=" + third + "]";
	}
}

enum TriangleType {
	RIGHT, ACUTE_ANGLED, OBTUSE_ANGLED, ILLEGAL;
}

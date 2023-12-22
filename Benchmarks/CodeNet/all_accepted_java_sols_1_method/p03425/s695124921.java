import java.util.*;

public  class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("M", (long) 0);
		map.put("A", (long) 0);
		map.put("R", (long) 0);
		map.put("C", (long) 0);
		map.put("H", (long) 0);
		for (int i = 0; i < count; i++) {
			String initial = sc.next().split("")[0];

			if (initial.equals("M") || initial.equals("A") || initial.equals("R") || initial.equals("C") || initial.equals("H")) {
				long value = map.get(initial);
				map.put(initial, value + 1);
			}
		}

		long result = 0;
		result += map.get("M") * map.get("A") * map.get("R");
		result += map.get("M") * map.get("A") * map.get("C");
		result += map.get("M") * map.get("A") * map.get("H");
		result += map.get("M") * map.get("R") * map.get("C");
		result += map.get("M") * map.get("R") * map.get("H");
		result += map.get("M") * map.get("C") * map.get("H");
		result += map.get("A") * map.get("R") * map.get("C");
		result += map.get("A") * map.get("R") * map.get("H");
		result += map.get("A") * map.get("C") * map.get("H");
		result += map.get("R") * map.get("C") * map.get("H");
		
		System.out.println(result);
	}
}
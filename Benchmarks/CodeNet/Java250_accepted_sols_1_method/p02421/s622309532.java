import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int point1 = 0, point2 = 0;
		String animal1, animal2;
		for (int i = 0; i < n; i++) {
			animal1 = sc.next();
			animal2 = sc.next();
			if (0 < animal1.compareTo(animal2)) {
				point1 += 3;
			} else if (0 > animal1.compareTo(animal2)) {
				point2 += 3;
			} else if (0 == animal1.compareTo(animal2)) {
				point1 += 1;
				point2 += 1;
			}
		}
		System.out.println(point1 + " " + point2);
		sc.close();
	}
}

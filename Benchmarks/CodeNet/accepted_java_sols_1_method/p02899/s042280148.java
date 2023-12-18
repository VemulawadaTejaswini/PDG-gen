import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] piledStudentList = sc.nextLine().split(" ");
		sc.close();
		
		int[] visitArr = new int[n];
		for(int i = 0; i < n; i++) {
			int piledStudents = Integer.parseInt(piledStudentList[i]);
			visitArr[piledStudents - 1] = i;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(visitArr[i] + 1);
			if(i < n -1) {
				System.out.print(" ");
			}
		}
		System.out.println("\n");
	}
}

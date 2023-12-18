import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] name = new String[N];
		int[] counter = new int[4];

		for(int i = 0; i < N; i++) {
			name[i]  = sc.next();

			switch(name[i]) {
				case "AC":
					counter[0]++;
					break;
				case "WA":
					counter[1]++;
					break;
				case "TLE":
					counter[2]++;
					break;
				case "RE":
					counter[3]++;
					break;
				default:
					break;
			}
		}

		System.out.println("AC x " + counter[0]);
		System.out.println("WA x "+  counter[1]);
		System.out.println("TLE x "+counter[2]);
		System.out.println("RE x " + counter[3]);
	}
}
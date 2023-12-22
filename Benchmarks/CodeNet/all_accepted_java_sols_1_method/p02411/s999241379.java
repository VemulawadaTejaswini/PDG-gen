import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int m, f, r, i = 0;
		String score[] = new String[50];
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				m = sc.nextInt();
				f = sc.nextInt();
				r = sc.nextInt();
				if(m == -1 && f == -1 && r == -1) {
					for(int j = 0; j < i; j++) {
						System.out.println(score[j]);
					}
					break;
				}if(m == -1 || f == -1) {
					score[i] = "F";
				}else if(m + f >= 80) {
					score[i] = "A";
				}else if(m + f >= 65) {
					score[i] = "B";
				}else if(m + f >= 50) {
					score[i] = "C";
				}else if(m + f >= 30) {
					score[i] = "D";
					if(r >= 50) score[i] = "C";
				}else {
					score[i] = "F";
				}
				i++;
			}
			
		}
	}
}



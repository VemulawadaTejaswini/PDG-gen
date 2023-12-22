import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int p;
		int correctAns = 0;
		int penalties = 0;
		String s;
		int[] Problems = new int[n];
		//initialize array
		for(int i = 0; i < n; i++) {
			Problems[i] = 0;
		}
		for(int i = 0; i < m; i++) {
			p = in.nextInt();
			s = in.nextLine();
			//String wa = new String("WA");
			if(s.equals(" WA")) {
				if(Problems[p-1] != -1) {
					Problems[p-1]++;
				}	
			} else if (Problems[p-1] != -1) {
				correctAns++;
				penalties += Problems[p-1];
				//if visited set to -1
				Problems[p-1] = -1;
			}
		}
		System.out.println(correctAns + " " + penalties);
	}
}

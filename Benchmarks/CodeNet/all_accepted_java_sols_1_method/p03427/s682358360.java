import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int[] n = new int[s.length];
		for(int i =0;i <s.length;i++) {
			n[i] = Integer.parseInt(s[i]);
		}
		boolean kurisageFlag = false;
		for(int i =0;i <n.length;i++) {
			if(i ==0) {
				continue;
			}
			if(kurisageFlag) {
				n[i] =9;
				continue;
			}

			if(n[i] <=7) {
				n[i-1]--;
				n[i] =9;
				kurisageFlag = true;
			}
		}
		long answer = 0;
		for(int ne:n) {
			answer+= ne;
		}
		System.out.println(answer);
	}
}
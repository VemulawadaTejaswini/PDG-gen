import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] s = new String[9];
			int[] num = new int[9];
			int[] sum = new int[9];
			for(int i=0;i<9;i++){
				s[i] = sc.next();
				int a = sc.nextInt();
				int b = sc.nextInt();
				num[i] = a + b;
				sum[i] = a*200 + b*300;
			}
			for(int i=0;i<9;i++){
				System.out.println(s[i] + " " + num[i] + " " + sum[i]);
			}
		}
		
	}	
}
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		double win=0;
		
		String K = Integer.toBinaryString(k);
		int count=0;
		for(int i=1;i<=n;i++){
			String s = Integer.toBinaryString(i);
			while(s.length()<K.length()) {
				s = s + "0";
				count++;
			}
			
			if(Integer.parseInt(s,2)<Integer.parseInt(K,2)) {
				count++;
			}
			
			win += 1/Math.pow(2,count);
			count=0;
		}
		
		
		System.out.println(win/n);
	}
}
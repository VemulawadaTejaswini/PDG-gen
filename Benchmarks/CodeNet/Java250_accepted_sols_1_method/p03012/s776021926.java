import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		int m = scan.nextInt();
//		int a = scan.nextInt();
		
		int[] ww = new int[n];
		int s1 = 0;
		int s2 = 0;
		int ss = 0;
		for(int i=0;i<n;i++) {
			int w = scan.nextInt();
			ww[i] = w;
		}
		for(int i=1; i<n; i++) {
			for(int j=0;j<n;j++) {
				if(j<=i) {
					s1+=ww[j];
				}else {
					s2+=ww[j];
				}
			}
  
			if(i==1) {
			ss = Math.abs(s2-s1);
			}if(ss>Math.abs(s2-s1)) {
				ss = Math.abs(s2-s1);
			}
			s1=0;
			s2=0;
			
		}
		System.out.println(ss);
		
	}

}
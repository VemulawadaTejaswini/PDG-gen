import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				int R=sc.nextInt();
				int W=sc.nextInt();
				int C=sc.nextInt();
				int r=sc.nextInt();
				if(R==0 && W==0 && C==0 && r==0) {
					break;
				}
				int a=0;
				for(int i=0;; i++) {
					if(W*C<=R+r*i) {
						a=i;
						break;
					}
				}
				System.out.println(a);
			}
		
	}
}

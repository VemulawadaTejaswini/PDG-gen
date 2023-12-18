import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i=1;
		int H[]=new int[300];
		int W[]=new int[300];
		
		for(;;) {
			H[i]=sc.nextInt();
			W[i]=sc.nextInt();
			if(H[i]==0 && W[i]==0) {
				break;
			}
			i++;
		}
		i=1;
		for(;;) {
			if(H[i]==0 && W[i]==0) {
				break;
			}
			int j,k;
			for(j=1;j<=H[i];j++) {
				for(k=1;k<=W[i];k++) {
					if(j%2==1) {//奇数列目
						if(k%2==1) {
							System.out.print("#");
						}else {
							System.out.print(".");
						}
					}else {
						if(k%2==0) {
							System.out.print("#");
						}else {
							System.out.print(".");
						}
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
			i++;
		}
	}
}

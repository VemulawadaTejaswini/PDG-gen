import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String[] args) {
		//System.out.println("Please input H and W below");
		//宣言
		sc = new Scanner(System.in);
		int H[]= new int[300];
		int W[]= new int[300];
		int i=1;
		//入力
		for(;;) {
			H[i]=sc.nextInt();
			W[i]=sc.nextInt();
			if(H[i]==0 && W[i]==0) {
				break;
			}
			i++;
		}
		i=1;
		/*System.out.printf("H[%d]=%d,W[%d]=%d\n", i,H[i],i,W[i]);*/
		//出力
		for(;;){
			if(H[i]==0 && W[i]==0) {
				break;
			}
			//長方形
			int j,k;
			for(j=1;j<=H[i];j++) {
				for(k=1;k<=W[i];k++) {
					System.out.print("#");
				}	
				System.out.print("\n");
			}
			System.out.print("\n");
			i++;
		}
	}
}


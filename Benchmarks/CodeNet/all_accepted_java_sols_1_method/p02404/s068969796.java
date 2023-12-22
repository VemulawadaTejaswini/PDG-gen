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
		int j=1,k=1;
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
		//出力
		for(;;){
			if(H[i]==0 && W[i]==0) {
				break;
			}
			for(j=1;j<=H[i];j++) {
				if(j==1 ||j==H[i]) {//上辺と下辺
					for(k=1;k<=W[i];k++) {
						System.out.print("#");
					}
					System.out.print("\n");
				}else{//それ以外
					for(k=1;k<=W[i];k++) {
						if(k==1 ||k==W[i]) {
							System.out.print("#");
						}else {
							System.out.print(".");
						}
					}
					System.out.print("\n");
				}
			}
			System.out.print("\n");
			i++;
		}
	}
}


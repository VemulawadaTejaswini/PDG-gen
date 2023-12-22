import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//縦H,横Wの＃でできた長方形を作成する
		//HとWがともに0の場合に終了
		Scanner sc=new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0 && W==0){
				break;
			}
			for(int i=1;i<=H;i++){
				for(int j=1;j<=W;j++){
					System.out.print("#");
					if(j==W){
						System.out.println();
					}
				}
				if(i==H){
					System.out.println();
				}
			}
		}
	}

}


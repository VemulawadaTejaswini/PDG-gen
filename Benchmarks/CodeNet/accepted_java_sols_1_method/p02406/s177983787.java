import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			if(i%3==0){ //3の倍数を出力
				System.out.print(" "+i);
			}else{
				int x=i;
				while(true){
					if(x%10==3){ //3のつく数字を出力
						System.out.print(" "+i);
						break;
					}else if(x/10==0){ //10で割ったときの商が0の時終了
						break;
					}else{ //それ以外の時はxにx/10の値を入力
						x=x/10;
					}
				}
			}
		}
		System.out.println();
	}

}


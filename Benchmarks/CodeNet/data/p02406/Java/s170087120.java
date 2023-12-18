import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=3, flg=0; i<=n; i++){
			if(i%3==0 || i%10==3){
				if(flg==0){
					flg = 1;
				} else{
					System.out.print(" ");
				}
				System.out.print(i);
			}
		}
	}
}
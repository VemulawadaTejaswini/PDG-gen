import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;

		for(i=1;i<=n;i++){
			if(i%3==0){
				System.out.print(" "+i);
			}
			int x = i;
			while(i%3!=0){
				if(x==0)break;
				if(i%10==3||x%10==3){
					System.out.print(" "+i);
					break;
				}else{
					x = x/10;
				}
			}
		}
		System.out.println();
	}
}
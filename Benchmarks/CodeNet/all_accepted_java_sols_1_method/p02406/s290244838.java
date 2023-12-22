import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i,x;
		for(i=1;i<=n;i++){
			x=i;
			if(x%3==0){
				System.out.printf(" %d", i);
			}else{
			while(true){
				if(x%10==3){
					System.out.printf(" %d", i);
					break;
				}
				x/=10;
				if(x<3){
					break;
				}
			}
			}
		}
		System.out.println();
	}
}
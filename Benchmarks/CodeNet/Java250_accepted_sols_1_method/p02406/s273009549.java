import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		int n = new Scanner(System.in).nextInt();
		int i=1;
		do{
			int x=i;
			if(x%3==0){
				System.out.print(" "+i);
			}else{
				if(x/1000==3||x%1000/100==3||x%1000%100/10==3||x%1000%100%10==3||
					x/100==3||x%100/10==3||x%100%10==3||x/10==3||x%10==3){
					System.out.print(" "+i);
				}
			}
		}while(++i<=n);
		System.out.println("");
	}
}
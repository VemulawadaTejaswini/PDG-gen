import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++){
			if(i%3==0)System.out.printf(" %d",i);
			
			else {
				int x=i;
				while(x>0){
					if(x%10==3){System.out.printf(" %d",i);break;}
					else x/=10;
				}
			}
		}
		System.out.println();
	}
}

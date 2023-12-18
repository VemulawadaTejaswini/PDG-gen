import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		int trib[] =new int[30];
		trib[0]=1;
		trib[1]=2;
		trib[2]=4;
		for(int i=3;i<30;i++){
			trib[i]= trib[i-1] +trib[i-2]+trib[i-3];
		}
		for(;;){
			n=sc.nextInt();
			if(n==0){
				System.exit(0);
			}
			if((trib[n-1]/10)%365==0){
				if(trib[n-1]/10==0){
				System.out.println(1);
				}else{
					System.out.println(((trib[n-1]/10)/365));
				}
				
			}else{
				if(trib[n-1]/10==0){
				System.out.println(1);
				}else{
					System.out.println(((trib[n-1]/10)/365)+1);
				}
			}
			
		
		}
	}
}
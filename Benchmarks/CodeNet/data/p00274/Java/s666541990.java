//2736 問四 渡辺彩子
import java.util.Scanner;

public class Main{
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int ijyo,i,n,k;
		ijyo=1;
		i=0;
		
		n=sc.nextInt();
		while(n!=0){
			for(int h=0;h<n;h++){
				k=sc.nextInt();
				
				if(k>=2){
					ijyo++;
				}else{
				}
				if(k==1){
					i++;
				}
			}
			
			if(ijyo>=2){
				System.out.println(ijyo+i);
			}else{
				System.out.println("NA");
			}
			
			ijyo=1;
			i=0;
			n=sc.nextInt();
		}
	}
	
	public static void main(String[]args){
	      Main obj=new Main();
		  obj.solve();
	}
}
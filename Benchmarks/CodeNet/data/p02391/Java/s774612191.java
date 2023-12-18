//2704 ??????????????± 1_2_A
import java.util.Scanner;
public class Main{
	
    public void solve(){
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a<b)
		{
			System.out.println("a<b");
		}else{ if(a>b)
			{
				System.out.println("a>b");
			}else{
				System.out.println("a==b");
			}
		}
	}
	public static void main(String[]args){
		Main obj=new Main();
		Scanner sc=new Scanner(System.in);
		obj.solve();
	}
}
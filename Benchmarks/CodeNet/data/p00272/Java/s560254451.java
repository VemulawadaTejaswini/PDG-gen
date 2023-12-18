//2706 石井夏鈴 問5
import java.util.Scanner;
public class Main{
	int n,t;
	int a=0;
	int ti[]={0,6000,4000,3000,2000};
	
    public void solve(){
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=4;i++){
			t=sc.nextInt();
			n=sc.nextInt();
			a=ti[t]*n;
    System.out.println(a);
		}
	}
   public static void main(String[] args){
   	Main obj=new Main();
	obj.solve();
   }
}
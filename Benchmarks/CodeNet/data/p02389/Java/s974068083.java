import java.util.Scanner;
class Main{

	public void solve(){
    Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int men=a*b;
		int nag=2*a+2*b;
		
		System.out.println(men+"\t"+nag);
	}
	public static void main(String[] args){
        Main obj =new Main();
        obj.solve();
    }
}
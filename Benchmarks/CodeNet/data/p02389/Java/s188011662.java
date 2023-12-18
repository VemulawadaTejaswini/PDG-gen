import java.util.Scanner;
class Main{
	
	int a;
	int b;
	
	public void solve(){
    Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println(a*b);
		System.out.println(2*a+2*b);
	}
	public static void main(String[] args){
        Main obj =new Main();
        obj.solve();
    }
}
import java.util.Scanner;
public class Main{
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a*b);
		System.out.println(a+a+b+b);
    }

             
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}
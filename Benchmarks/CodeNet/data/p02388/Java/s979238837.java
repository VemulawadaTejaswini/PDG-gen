import java.util.Scanner;
class Main{
 
    public void solve(){
		Scanner sc = new Scanner(System.in);
       int a, x;
       	   a = sc.nextInt();
		   x = a * a * a;
		  System.out.print(x);
		  System.out.println();
    }
		   
	   
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}
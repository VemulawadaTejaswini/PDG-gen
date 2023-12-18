import java.util.Scanner;
class Main{
 
    public void solve(){
		Scanner sc = new Scanner(System.in);
       int a, b, c, d;
       	   a = sc.nextInt();
		   b = sc.nextInt();
		   c = a * b;
		   d = (a * 2) + ( b * 2);
		  System.out.print(c+"\t"+d);
		  System.out.println();
    }
		   
	   
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}
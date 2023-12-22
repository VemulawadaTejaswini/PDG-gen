import java.util.Scanner;
public class Main{
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
	    int	b = sc.nextInt();
		
		System.out.println( a*b + " " + (a+b)*2 ); 
	
    }
   
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
} 
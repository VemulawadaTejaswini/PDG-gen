import java.util.Scanner;
class Main{
 
    public void solve(){
		Scanner sc = new Scanner(System.in);
       int a, b;
	   a = sc.nextInt();
	   b = sc.nextInt();
	   
	   if(a < b){
	   	System.out.print("a < b");
	   }else if(a > b){
	   	System.out.print("a > b");
	   }else if(a == b){
	   	System.out.print("a == b");
	   }
	  
	   System.out.println();
	   
    }
		   
	   
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}
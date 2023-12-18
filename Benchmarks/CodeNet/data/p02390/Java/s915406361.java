import java.util.Scanner;
class Main{
 
    public void solve(){
		Scanner sc = new Scanner(System.in);
       int S, h, m, s;
	   S = 86400;
	   S = sc.nextInt();
	   h = S / 3600;
	   m = (S-(h*3600))/60;
	   s = S-(h*3600+m*60);
	   
	   System.out.print(h+"???"+m+":"+s);
	   System.out.println();
	   
    }
		   
	   
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}
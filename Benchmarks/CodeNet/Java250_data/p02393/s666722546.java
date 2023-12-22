import java.util.Scanner;
public class Main{
     
    public void solve(){
		Scanner sc = new Scanner(System.in);
		
        int a,b,c,hozon;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b){
			hozon = a;
			a = b;
			b = hozon;
		}if(b > c){
			hozon = b;
			b = c;
			c = hozon;
		}if(a > b){
			hozon = a;
			a = b;
			b = hozon;
		}
		
		System.out.println(a+" "+b+" "+c);
    }			
       public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
     }
}
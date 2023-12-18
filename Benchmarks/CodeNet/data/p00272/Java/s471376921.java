import java.util.Scanner;
public class Main{
    int t,n;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
		
        while(t <= 4 && n <= 10000){
            t = sc.nextInt();
            n = sc.nextInt();
		    if(t == 1){
				System.out.println(6000*n);
        }else if(t == 2){
			System.out.println(4000*n);
        }else if(t == 3){
			System.out.println(3000*n);
        }else if(t == 4){
			System.out.println(2000*n);
        }
      }
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
    
}
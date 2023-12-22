import java.util.*;


public class Main{
	public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n < 2*m){
            System.out.print("0");
        }else{
            System.out.print(n-2*m);
        }
        
    }
}
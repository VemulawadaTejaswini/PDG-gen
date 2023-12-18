import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long A = a/x;
        long B = b/x;
        
        if(a%x == 0){
            System.out.println(B-A+1);
        }else{
            System.out.println(B-A);
        }
	}
}

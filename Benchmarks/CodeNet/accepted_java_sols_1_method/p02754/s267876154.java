import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long syou = N/(A+B);
        long amari = N%(A+B);
        
        if(amari<=A){
        System.out.println(syou*A+amari);
        }else{
        System.out.println(syou*A+A);
	}
}
}
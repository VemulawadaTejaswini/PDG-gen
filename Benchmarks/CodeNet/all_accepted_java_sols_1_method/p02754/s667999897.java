import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
 
        long s = n / (A + B);
        long t = n % (A + B);
        long count = 0;
 
        count = s * A;
        if(t >= A){
            count += A;
        }else{
            count += t;
        }
        System.out.println(count);
        
	}
}

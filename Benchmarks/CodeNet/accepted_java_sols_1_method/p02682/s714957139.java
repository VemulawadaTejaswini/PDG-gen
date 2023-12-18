import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Long A = scanner.nextLong();
        Long B = scanner.nextLong();
        Long C = scanner.nextLong();
        Long K = scanner.nextLong();
        Long count = 0L;
        if(K >= A){
            K = K - A;
            count += A;
        }else{
            count += K;
            K = 0L;
        }
        K = K - B;
        if(K > 0){
            count = count - K;
        }

        System.out.println(count);
        
	}
}
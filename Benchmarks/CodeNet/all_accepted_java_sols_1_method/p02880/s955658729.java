import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        if(IntStream.range(1, 10).anyMatch(s -> N % s == 0 && N / s <= 9)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}

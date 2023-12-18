
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int A=scanner.nextInt();
        final int B=scanner.nextInt();
        int max=Math.max(A,B);
        if(max<=8){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }

    }
}

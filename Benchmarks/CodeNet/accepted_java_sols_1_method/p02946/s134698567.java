import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int x = scan.nextInt();
        int min = x - k + 1;
        int max = k + x - 1;
        if(min < -1000000){
            min = -1000000;
        }
        if(max > 1000000){
            max = 1000000;
        }
        for(int i = min; i <= max; i++){
            System.out.print(i + " ");
        }
    }
}
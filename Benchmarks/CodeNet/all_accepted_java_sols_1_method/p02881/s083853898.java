import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long num = in.nextLong();
            long sqr = (long) Math.ceil(Math.sqrt(num)) + 1;
            ArrayList<Long> arr = new ArrayList<>();
            arr.add(num - 1);
            for (long i = 1; i < sqr; i++){
                if (num%i == 0){
                    arr.add((num/i) + i - 2);
                }
            }
            System.out.println(Collections.min(arr));
        }
    }
}

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = num + 10000;
        String ans = "Good";
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        for(int i =0; i<3; i++){
            if(list.get(i) == list.get(i+1)){
                ans = "Bad";
            }
        }
        System.out.println(ans);
    }
}
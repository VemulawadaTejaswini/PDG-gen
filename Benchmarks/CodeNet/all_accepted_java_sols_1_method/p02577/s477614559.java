import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        boolean flag = false;
        String[] strArray = N.split("");
        int[] array = Arrays.asList(strArray).stream().mapToInt(Integer::parseInt).toArray();
        int sum = java.util.Arrays.stream(array).sum();

        if(sum % 9 == 0 || sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

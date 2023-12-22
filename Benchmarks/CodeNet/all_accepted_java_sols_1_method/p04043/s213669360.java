import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        int[] arr2 = {5, 5, 7};
        Arrays.sort(arr);
        if(Arrays.equals(arr, arr2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

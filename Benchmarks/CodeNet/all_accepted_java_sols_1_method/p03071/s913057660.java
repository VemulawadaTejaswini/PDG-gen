import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Integer[] arr = {a, a - 1, b, b - 1};
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(arr[0]+arr[1]);
    }
    }


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);
        if (arr[0] == 5 && arr[1] == 5 && arr[2] == 7) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}

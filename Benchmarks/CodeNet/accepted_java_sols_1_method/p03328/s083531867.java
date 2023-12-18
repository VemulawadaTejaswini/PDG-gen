import java.awt.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        int arr[] = new int[1000];
        arr[0] =1;
        for(int i=1;i<1000;i++){
            arr[i] = arr[i-1]+i+1;
        }
        int diff = b-a;
        System.out.println(arr[diff-2] -a);
    }
}

import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int start = x - k + 1;
        for(int i = 0;i<(k*2-1);i++){
            System.out.print(start + " ");
            start++;
        }
        System.out.println();
        sc.close();
    }
}
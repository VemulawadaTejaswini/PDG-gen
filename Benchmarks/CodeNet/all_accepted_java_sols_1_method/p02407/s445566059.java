import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.print(array[n-1]);
       for(int i = n-2; i >= 0; i--){
           System.out.print(" " + array[i]);
       }
       System.out.println("");
    }
}

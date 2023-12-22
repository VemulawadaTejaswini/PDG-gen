import java.util.*;
public class Main {

    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0 ; i < 5 ; i++)
            a[i] = s.nextInt();      
        Arrays.sort(a);
        for(int j = a.length - 1 ; j > 0 ; j--)
            System.out.print(a[j] + " ");
        System.out.println(a[0]);
    }
}
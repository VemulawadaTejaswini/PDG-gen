import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner s = new Scanner(System.in);
        double a[] = new double[5];
        for(int i = 0; i < 5; i++){
            a[i] = s.nextInt();
        }
        double miti =  Math.abs(a[0] - a[2]) ;
        double haya = a[1] - a[3];
        if(miti <= haya * a[4]) System.out.println("YES");
        else  System.out.println("NO");
       // System.out.println(str.substring(0,3));
    }
}
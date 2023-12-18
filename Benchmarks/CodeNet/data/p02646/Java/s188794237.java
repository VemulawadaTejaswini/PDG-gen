import java.util.*;
public class Main {
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0; i < 4; i++){
            a[i] = s.nextInt();
        }
        int miti =  a[2] - a[0] ;
        int haya = a[1] - a[3];
        if(miti <= haya * a[4]) System.out.println("YES");
        else  System.out.println("NO");
       // System.out.println(str.substring(0,3));
    }

}
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long h=sc.nextLong();
        long n=sc.nextLong();
        long ans =0;
        for(long i=0;i<n;i++){
            ans+=sc.nextLong();
        }
        String s;
        if(ans>=h)
            s = "Yes";
            else
            s = "No";
        System.out.println(s);
    }
}

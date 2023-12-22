

import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args)
    {
        double i,j,k=0;
        int m;
        Scanner sc =new Scanner(System.in);
        i=sc.nextLong();
        j=sc.nextLong();
        k=i/j;
        m=(int)(Math.ceil(k));
        System.out.println(m);
    }
}
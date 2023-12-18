import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int D=sc.nextInt();
        int x=sc.nextInt();
        int ans[]=new int[11];
        ans[0]=x;
        for (int i=0 ; i<10; i++)
        {
            ans[i+1]=r*ans[i]-D;
            System.out.println(ans[i+1]);
        }

    }
}
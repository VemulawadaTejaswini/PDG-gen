import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),K=sc.nextInt();
        int res = 0;
        for(int i=1;i<=n;i+=2) res++;
        String ans = res>=K?"YES":"NO";
        System.out.println(ans);
    }
}

import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(), b =sc.nextInt();
        int ans = b%a==0?a+b:b-a;
        System.out.println(ans);
    }
}

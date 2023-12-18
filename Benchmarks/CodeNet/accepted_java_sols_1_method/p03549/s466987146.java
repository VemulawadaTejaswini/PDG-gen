import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M=sc.nextInt();
        int ans = ((N-M)*100+M*1900)*(1<<M);
        System.out.println(ans);
    }
}

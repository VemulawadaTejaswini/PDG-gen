import java.util.*;
import java.io.*;
public class Main {

    public static void main (String[] args) throws java.lang.Exception
{
    BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
    String[] s1 = inp.readLine().split(" ");
    int A = Integer.parseInt(s1[0]);
    int B = Integer.parseInt(s1[1]);
    if(A<=9 && A>=0 && B<=9 && B>=0){
        System.out.println(A*B);
    }else{
        System.out.println(-1);
    }

    
}
}
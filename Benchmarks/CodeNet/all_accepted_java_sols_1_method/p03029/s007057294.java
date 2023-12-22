import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      	PrintWriter out = new PrintWriter(System.out);
        int a = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        int aaa = a * 3;
        int pi = (aaa + p) / 2;
        out.println(pi);
      	out.flush();
    }
}
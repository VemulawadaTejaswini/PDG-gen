import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String op=st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            if(op.equals("+")){ System.out.println(a+b); }
            else if(op.equals("-")){ System.out.println(a-b); }
            else if(op.equals("*")){ System.out.println(a*b); }
            else if(op.equals("/")){ System.out.println(a/b); }
            else break;
        }
    }
}
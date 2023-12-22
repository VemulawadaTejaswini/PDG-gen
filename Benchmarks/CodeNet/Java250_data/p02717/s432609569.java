import java.util.*;
import java.io.*;
class Main{

    public static void main(String []args) throws Exception {
        //BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int temp = b;
        b = a;
        a = temp;
        temp = c;
        c= a;
        a = temp;
        System.out.println(a + " " + b + " " + c);
        
    }
}
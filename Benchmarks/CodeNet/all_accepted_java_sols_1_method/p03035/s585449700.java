import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        System.out.println(a >= 13 ? b : (a <= 5 ? 0 : b/2));
   }
}

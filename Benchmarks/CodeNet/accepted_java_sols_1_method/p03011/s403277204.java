import java.util.*;
class Main{
    public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in); 
       int p = stdIn.nextInt();
       int q = stdIn.nextInt();
       int r = stdIn.nextInt();
       System.out.println(Math.min(p+q , Math.min(q + r, r + p)));
    }
}
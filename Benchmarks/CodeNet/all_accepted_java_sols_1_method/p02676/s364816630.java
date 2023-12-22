import java.util.Scanner;

public class Main{
    public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    //String n2 = scan.next();
    String s = scan.next();

    /*System.out.println(s);
    System.out.println(n2);*/

    if (s.length() <= n) {
        System.out.println(s);
    } else {
        String s2 = s.substring(0, n);
        System.out.println(s2+"...");
    }


      scan.close();
    }
  }
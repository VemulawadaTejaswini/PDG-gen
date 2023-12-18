import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String a[]=sc.nextLine().split("",0);
      String b[]=sc.nextLine().split("",0);
      System.out.println((a[0].equals(b[2])&&a[1].equals(b[1])&&a[2].equals(b[0]))?"YES":"NO");
    }
}

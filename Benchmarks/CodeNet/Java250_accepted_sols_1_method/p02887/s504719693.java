import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int count=0;

    for (int i=0;i<s.length()-1;i++) {

        if (s.charAt(i)==s.charAt(i+1)) {

        }else{
          count=count+1;
        }

    }

    System.out.println(count+1);
  }
}

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s1 = sc.next();
    String s2 = sc.next();

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();

    String s3 = "";

    for(int i=0;i<n;i++){
      s3 = s3 + c1[i] +c2[i];
    }

    System.out.println(s3);


  }
}
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt()-1;
    StringBuilder sb = new StringBuilder(sc.next());
    sb.setCharAt(k,(char)(sb.charAt(k)+32));
    System.out.println(sb.toString());
  }
}
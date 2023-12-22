import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int max=0;
    for(int i=0;i<6;i++){
      max+=s.charAt(i)-'0';
    }
    System.out.println(max);
  }
}
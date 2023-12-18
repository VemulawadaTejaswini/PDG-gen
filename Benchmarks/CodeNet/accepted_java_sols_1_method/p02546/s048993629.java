import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int ss=s.lastIndexOf("s");
    if(ss==s.length()-1)System.out.println(s+"es");
    else System.out.println(s+"s");
  }
}
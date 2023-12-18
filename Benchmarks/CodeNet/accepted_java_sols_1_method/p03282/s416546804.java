import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    long k=sc.nextLong();
    int count=0;
    while(count<s.length()&&s.charAt(count)=='1')count++;
    if(k>count)System.out.println(s.charAt(count));
    else System.out.println(1);
  }
}
import java.util.*;
public class Main {
  public static void main(String[] args){
    int counter=0;
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char[] s=str.toCharArray();
    if(s[0]=='1') counter++;
    if(s[1]=='1') counter++;
    if(s[2]=='1') counter++;
    System.out.println(counter);
    }
}
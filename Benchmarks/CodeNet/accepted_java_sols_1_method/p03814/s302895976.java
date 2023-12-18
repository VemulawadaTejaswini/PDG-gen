import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    sc.close();
    int start=0,end=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='A'){
        start=i;
        break;
      }
    }
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='Z'){
        end=i;
      }
    }
    System.out.println(end-start+1);
  }
}
import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s =  sc.next();;
    char h = '-';
    char p = (s.charAt(a));
    int result1 = 0;
    int result2 = 0;
    int ss = s.length();

    if(h==p){
      result1 =1;
    }
    
    String ints = s.replaceAll("[^\\d]", "");
    if((ints.length())==(a+b)){
      result2 = 1;
    }
       
    if((result1 == 1) && (result2 == 1) && (ss== a+b+1 )){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
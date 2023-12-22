import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int answer=0;
    if(a==b){
      answer=c;
    }else if(a==c){
      answer=b;
    }else{
      answer=a;
    }
    System.out.println(answer);
  }
  

  
}
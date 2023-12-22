import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long k = sc.nextLong();
    String answer ="1";
    long one= 0;
    for(int i =0;i<s.length();i++){
      if(!s.substring(i,i+1).equals("1")){
        answer = s.substring(i,i+1);
        break;
      }else{
        one=one+1;
      }
    }
    if(k<=one){
       System.out.println("1");
    }else{
       System.out.println(answer);
    }
    
  }

  

  
}

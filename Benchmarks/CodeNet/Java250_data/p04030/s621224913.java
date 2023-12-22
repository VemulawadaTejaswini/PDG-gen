import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int Bstock =0;
    String ans = "";
    for(int i=s.length()-1;i>=0;i--){
      if(s.substring(i,i+1).equals("B")){
        Bstock++;
      }else if(Bstock>0){
        Bstock--;
      }else{
        ans=s.substring(i,i+1)+ans;
      }
    }
    System.out.println(ans);
        
  }
  

  
}
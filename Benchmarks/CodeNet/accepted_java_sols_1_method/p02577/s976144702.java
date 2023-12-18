import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String ss=sc.next();
    int ans=0;
    for(int i=0;i<ss.length();i++){
      ans=(ans+Integer.parseInt(ss.substring(i,i+1)))%9;
    }
           if(ans==0){
             System.out.println("Yes");
           }
           else{
             System.out.println("No");
           }
  }
  
}
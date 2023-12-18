import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    String a=sc.next();
    String b=sc.next();
    boolean ans=true;
    if(a.length()>b.length()){
      System.out.println("GREATER");
    }else if(a.length()<b.length()){
      System.out.println("LESS");
    }else{
      for(int i=0;i<a.length();i++){
        char aa=a.charAt(i);
        char bb=b.charAt(i);
        if (aa>bb){
          System.out.println("GREATER");
          ans=false;
          break;
        }
        else if(aa<bb){
          System.out.println("LESS");
          ans=false;
          break;
        }
      }
      if(ans==true)System.out.println("EQUAL");
    }
    
  }
}
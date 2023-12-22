import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    sc.close();
    boolean isAequalB=true;
    if(a.length()>b.length()){
      System.out.println("GREATER");
    }else if(a.length()<b.length()){
      System.out.println("LESS");
    }else{
      for(int i=0;i<a.length();i++){
        int aCap=Integer.parseInt(a.substring(i,i+1));
        int bCap=Integer.parseInt(b.substring(i,i+1));
        if(aCap>bCap){
          System.out.println("GREATER");
          isAequalB=false;
          break;
        }else if(aCap<bCap){
          System.out.println("LESS");
          isAequalB=false;
          break;
        }
      }
      if(isAequalB){
        System.out.println("EQUAL");
      }
    }
  }
}
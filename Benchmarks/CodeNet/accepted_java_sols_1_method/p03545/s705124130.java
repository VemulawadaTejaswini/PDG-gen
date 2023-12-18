
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int A=Integer.parseInt(S.substring(0,1));
    int B=Integer.parseInt(S.substring(1,2));
    int C=Integer.parseInt(S.substring(2,3));
    int D=Integer.parseInt(S.substring(3,4));
    int tar=7-A;
    String cA=S.substring(0,1);
    String cB=S.substring(1,2);
    String cC=S.substring(2,3);
    String cD=S.substring(3,4);
    if(B+C+D==tar){
      System.out.println(cA+"+"+cB+"+"+cC+"+"+cD+"=7");
      return;
    }else if(B+C-D==tar){
      System.out.println(cA+"+"+cB+"+"+cC+"-"+cD+"=7");
      return;
    }else if(B-C+D==tar){
      System.out.println(cA+"+"+cB+"-"+cC+"+"+cD+"=7");
      return;
    }else if(B-C-D==tar){
      System.out.println(cA+"+"+cB+"-"+cC+"-"+cD+"=7");
      return;
    }else if(-B+C+D==tar){
      System.out.println(cA+"-"+cB+"+"+cC+"+"+cD+"=7");
      return;
    }else if(-B+C-D==tar){
      System.out.println(cA+"-"+cB+"+"+cC+"-"+cD+"=7");
      return;
    }else if(-B-C+D==tar){
      System.out.println(cA+"-"+cB+"-"+cC+"+"+cD+"=7");
      return;
    }else if(-B-C-D==tar){
      System.out.println(cA+"-"+cB+"-"+cC+"-"+cD+"=7");
      return;
    }
    
    
    

  }
    


  
}

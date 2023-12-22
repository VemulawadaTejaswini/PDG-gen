import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String Pass = sc.next();
    char Nums[]=new char[4];
    boolean result=false;
    for(int i=0;i<4;i++){
     Nums[i] =Pass.charAt(i);
    }
    for(int i=1;i<4;i++){
     if( Nums[i-1]==Nums[i]){
     	result=true;
     }
    }if(result==true){
    System.out.println("Bad");
    }else{
     System.out.println("Good");
    }
  }
  
  }

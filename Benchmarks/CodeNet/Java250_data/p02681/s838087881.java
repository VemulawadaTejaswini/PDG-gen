import java.util.Scanner;

public class Main{
  static public void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    String t = sc.nextLine();
    
    int sLength = s.length();
    int tLength = t.length();
    
    if((sLength+1) != tLength){
      System.out.println("No");
      return;
    }else if(sLength == 0){
      System.out.println("No");
      return;
    }
    
    int errFlag = 0;
    for(int i=0; i<sLength; i++){
      if(s.charAt(i) != t.charAt(i)){
        errFlag = 1;
      }
    }
    
    if(errFlag == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}
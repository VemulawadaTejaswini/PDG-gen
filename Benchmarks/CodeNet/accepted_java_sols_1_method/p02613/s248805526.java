import java.util.*;
 
public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    if(n>=1 && n<=100000){
    String[] list = new String[n];
    for(int i=0; i < n; ++i){
      list[i] = sc.next();
    }
    
    int acCount = 0;
    int waCount = 0;
    int tleCount = 0;
    int reCount = 0;
    for(int i=0; i < n; ++i){
      String str = list[i];
      
      if(str.equals("AC")){
        acCount++;
      }else if(str.equals("WA")){
        waCount++;
      }else if(str.equals("TLE")){
        tleCount++;
      }else if(str.equals("RE")){
        reCount++;
      }
      
    }
    
      System.out.println("AC" + " " + "x" + " " + acCount);
      System.out.println("WA" + " " + "x" + " " + waCount);
      System.out.println("TLE" + " " + "x" + " " + tleCount);
      System.out.println("RE" + " " + "x" + " " + reCount);
    
    }else{
      System.out.println("入力条件に違反しています");
    }
  }  
    
}
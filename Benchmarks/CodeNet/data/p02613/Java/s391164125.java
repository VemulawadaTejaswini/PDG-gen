import java.util.*;
 
public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    String list[] = new String[n];
    for(int i=0; i < n; ++i){
      list[i] = sc.next();
    }
    
    int acCount = 0;
    int waCount = 0;
    int tleCount = 0;
    int reCount = 0;
    for(int i=0; i < n; ++i){
      String str = list[i];
      
      switch(str){
        case "AC":
          acCount++;
          break;
        case "WA":
          waCount++;
          break;
        case "TLE":
          tleCount++;
          break;
        case "RE":
          reCount++;
          break;
        default:
          break;
      }
    }
    
      System.out.println("AC" + " " + "×" + " " + acCount);
      System.out.println("WA" + " " + "×" + " " + waCount);
      System.out.println("TLE" + " " + "×" + " " + tleCount);
      System.out.println("RE" + " " + "×" + " " + reCount);
    
  }  
}
import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    String j[] = new String[n];
    
    int ac = 0;
    int wa = 0;
    int tle = 0;
    int re = 0;       
   
    for(int i = 0; i<n ; ++i){
      j[i] = sc.next();
    }
    
    for(int i = 0; i<n ; ++i){
      if(j[i].equals("AC")){
        ac +=1;
      }else if(j[i].equals("WA")){
        wa +=1;
      }else if(j[i].equals("TLE")){
        tle +=1;
      }else if(j[i].equals("RE")){
        re +=1;
      }
    }
    System.out.println("AC x "+ac);
    System.out.println("WA x "+wa);
    System.out.println("TLE x "+tle);
    System.out.println("RE x "+re);
  }
}
import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    int days = 0;
    
     switch (s){
      case "SAT": days += 1; break;
      case "FRI": days += 2; break; 
      case "THU": days += 3; break;
      case "WED": days += 4; break;
      case "TUE": days += 5; break;        
      case "MON": days += 6; break;    
      case "SUN": days += 7; break;   
    }
    
    System.out.println(days);
  }
}
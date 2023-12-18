import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      long ac,wa,tle,re;
      ac = wa = tle = re = 0;
      long n = scan.nextInt();
      for(int i = 0;i < n;i++){
          switch (scan.next()) {
          case "AC":
              ac++;
              break;
            case "WA":
                wa++;
                break;
            case "TLE":
                tle++;
                break;
            case "RE":
                re++;
                break;
        }
      }
      
      System.out.println("AC×" + ac +  System.lineSeparator() + 
                        "WA×" + wa + System.lineSeparator() + 
                        "TLE×" + tle + System.lineSeparator() + 
                        "RE×" + re + System.lineSeparator());
    
    }
}
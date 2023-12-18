import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int ac,wa,tle,re;
      ac = wa = tle = re = 0;
      int n = scan.nextInt();
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
      
      System.out.println("AC × " + ac +  "\r\n" + 
                        "WA × " + wa + "\r\n" + 
                        "TLE × " + tle + "\r\n" + 
                        "RE × " + re + "\r\n");
    
    }
}
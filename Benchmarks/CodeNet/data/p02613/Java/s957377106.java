import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = Integer.parseInt(line);
      
      int ac = 0;
      int wa = 0;
      int tle = 0;
      int re = 0;
      for(int i=0;i<count;i++){
        String judge = sc.nextLine();
        switch(judge){
          case "AC":
            ac = ac + 1;
            break;
          case "WA":
            wa = wa + 1;
            break;
          case "TLE":
            tle = tle + 1;
            break;
          case "RE":
            re = re + 1;
            break;
          default:
            break;
        }
      }
      
      System.out.println("AC × "+String.valueOf(ac));
      System.out.println("WA × "+String.valueOf(wa));
      System.out.println("TLE × "+String.valueOf(tle));
      System.out.println("RE × "+String.valueOf(re));
    }
}
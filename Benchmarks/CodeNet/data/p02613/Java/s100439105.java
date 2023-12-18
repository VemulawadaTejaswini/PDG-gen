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
        line = sc.nextLine();
        switch(line){
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
          default:
        }
      }
      
      System.out.println("AC × "+String.valueOf(ac));
      System.out.println("WA × "+String.valueOf(wa));
      System.out.println("TLE × "+String.valueOf(tle));
      System.out.println("RE × "+String.valueOf(re));
    }
}
        
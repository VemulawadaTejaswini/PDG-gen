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
        if(judge.equals("AC")){
            ++ac;
        } else if(judge.equals("WA")){
            ++wa;
        } else if(judge.equals("TLE")){
            ++tle;
        } else {
            ++re;
        }
      }
      
      System.out.println("AC x "+String.valueOf(ac));
      System.out.println("WA x "+String.valueOf(wa));
      System.out.println("TLE x "+String.valueOf(tle));
      System.out.println("RE x "+String.valueOf(re));
    }
}
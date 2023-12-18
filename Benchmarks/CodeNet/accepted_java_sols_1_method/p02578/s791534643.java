import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int n = Integer.parseInt(line);
    
    line = sc.nextLine();
    String HeiSt[] = new String[n];
    HeiSt = line.split(" ", 0);
    int hei0 = Integer.parseInt(HeiSt[0]);
    int hei1;
    long step = 0;
    
    for(int i = 1; i < n; i++){
      hei1 = Integer.parseInt(HeiSt[i]);
      if(hei0 > hei1){
        step += hei0 - hei1;
      }else if(hei0 < hei1){
        hei0 = hei1;
      }
    }
    
    System.out.println(step);
  }
}
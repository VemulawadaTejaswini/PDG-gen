import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    int n = scan.nextInt();
    int m = scan.nextInt();
    int sum =0;
    
    for (int i=0;i<n;i++){
      int tmp = scan.nextInt();
      list.add(tmp);
      sum += tmp;
    }
    
    Collections.sort(list, Collections.reverseOrder());
    
    double rate = 1.0 * sum/(4*m);
    
    boolean can = true;
    
    for(int i=0;i<m;i++){
      if(list.get(i) < rate){
        can = false;
        break;
      }
    }
    
    if(can){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
  }
  
}
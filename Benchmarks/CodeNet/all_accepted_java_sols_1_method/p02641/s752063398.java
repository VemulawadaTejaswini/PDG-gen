import java.util.*;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> forbidden = new ArrayList<Integer>();
    int X = sc.nextInt();
    int f = sc.nextInt();
    for (int i=0;i<f;i++) {
      int j = sc.nextInt();
      forbidden.add(j);
    }
   
    int i = 0;
    int tf = 1;
	
    for (int h=0; h<100; h++) {
        for (int j=0;j<f;j++) {
            if (forbidden.get(j) == X-i) {
              tf = 0;
            }
        } if (tf == 1) {
          System.out.println(X-i);
          break;
        } else {
          tf = 1;
          for (int k=0;k<f;k++) {
            if (forbidden.get(k) == X+i) {
              tf = 0;
            }
          } if (tf == 1) {
            System.out.println(X+i);
            break;
          } else {
            i = i+1;
            tf = 1;
          }
        }
    }
    
  }
}
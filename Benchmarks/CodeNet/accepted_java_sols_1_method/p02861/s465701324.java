import java.util.*;
import java.lang.Math;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int x[] = new int [n];
    int y[] = new int [n];
    double dis=0;
    for(int i=0; i<n; i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(i!=j){
          int sx = x[i] - x[j];
          int sy = y[i] - y[j];
          dis+=Math.sqrt(sx*sx+sy*sy);
        }
      }
    }
    System.out.println(dis/n);
  }
}

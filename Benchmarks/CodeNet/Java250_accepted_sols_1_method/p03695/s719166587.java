import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    int color[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    for(int i=0; i<N; i++){
      a[i]=sc.nextInt();
      if (1 <= a[i] && a[i] <= 399) {
        color[0]++;
      } else if (400 <= a[i] && a[i] <= 799) {
        color[1]++;
      } else if (800 <= a[i] && a[i] <= 1199) {
        color[2]++;
      } else if (1200 <= a[i] && a[i] <= 1599) {
        color[3]++;
      } else if (1600 <= a[i] && a[i] <= 1999) {
        color[4]++;
      } else if (2000 <= a[i] && a[i] <= 2399) {
        color[5]++;
      } else if (2400 <= a[i] && a[i] <= 2799) {
        color[6]++;
      } else if (2800 <= a[i] && a[i] <= 3199) {
        color[7]++;
      } else if (3199 <= a[i]) {
        color[8]++;
      }
    }
    int min = 0;
    int max = 0;
    for(int i = 0; i<8; i++){
      if(color[i]!=0){
        min++;
      }
    }
    if(min == 0){
      min = 1;
      max = color[8];
    }else{
      max = min + color[8];
    }
    System.out.println(min+ " " + max);
  }
}
      
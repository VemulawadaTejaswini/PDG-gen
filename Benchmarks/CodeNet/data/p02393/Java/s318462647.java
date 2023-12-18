import java.util.*;

public class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int[] n = new int[3];
    n[0] = sc.nextInt();
    n[1] = sc.nextInt();
    n[2] = sc.nextInt();
    int min = min(n[0],n[1],n[2]);
    int max = min(-n[0],-n[1],-n[2]);
    int i;
    for(i = 0;i < n.length;i++){
      if(i != min && i != max)break;
    }
    System.out.println(n[min] + " " + n[i] + " " + n[max]);
}
public static int min (int a, int b, int c){
  int m  = -1;
  if (a <= b && a <= c){
    return 0;
  }else if (b <= a && b <= c){
    return 1;
  }else{
    return 2;
  }
}
}

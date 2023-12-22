import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt() * 1000;
    int a = sc.nextInt() * 1000;
    int[] h = new int[n];
    for(int i = 0;i<n;i++){
      h[i] = sc.nextInt() * 6;
    }
    int[] abs = new int[n];
    int minpoint = -1;
    int min = 2000000000;
    for(int i = 0;i<n;i++){
      abs[i] =t-h[i]-a;
      if(abs[i]<0)abs[i]*=-1;
      if(min > abs[i]){
        min = abs[i];
        minpoint = i;
      }
    }
    System.out.println(minpoint+1);
  }
}

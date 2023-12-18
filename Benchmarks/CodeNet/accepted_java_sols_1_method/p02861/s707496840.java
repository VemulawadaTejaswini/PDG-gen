import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    for(int i=0;i<n;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    double kumi=1;
    for(int i=n;i>0;i--){
      kumi*=i;
    }
    double loads=0;
    for(int j=n-1;j>0;j--){
      loads+=j;
    }
    double count = kumi*(n-1)/loads;
    double ans=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
         ans += (Math.sqrt(Math.pow(Math.abs(x[i]-x[j]),2)+Math.pow(Math.abs(y[i]-y[j]),2)))/kumi;
      }
    }
    ans*=count;
    System.out.println(ans);
    }
  }
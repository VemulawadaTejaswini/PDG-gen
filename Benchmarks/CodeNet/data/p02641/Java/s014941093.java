import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int x = Integer.parseInt(str[0]);
    int n = Integer.parseInt(str[1]);
    int[] p = new int[n];
    int ans = 0;
    if(n!=0) {
      str = in.readLine().split(" ");
      int min = 1000;
      int[] ary = new int[100];
      for(int i=0; i<100; i++) {
        ary[i]=i+1;
      }
      for(int i=0; i<n; i++) {
        p[i] = Integer.parseInt(str[i]);
        for(int j=0; j<100; j++) {
          if(p[i]==ary[j]){
            ary[j]=0;
            break;
          }
        }
      }
      for(int i=0; i<100; i++) {
        if(ary[i]!=0) {
          if(ary[i]>=x){
            if(ary[i]-x<min){
              min = ary[i]-x;
              ans = ary[i];
            }
          } else{
            if(x-ary[i]<min){
              min = x-ary[i];
              ans = ary[i];
            }
          }
        }
      }
    }
    System.out.println(n==0?x:ans);
  }
}
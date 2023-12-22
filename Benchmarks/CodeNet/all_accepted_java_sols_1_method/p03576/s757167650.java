import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] x = new long[n];
    long[] y = new long[n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextLong();
      y[i]=sc.nextLong();
    }
    long num = (long)Math.pow(10,18)*4;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        for(int m=0;m<n;m++){
          for(int u=0;u<n;u++){
            long minX = Math.min(Math.min(x[i],x[u]),Math.min(x[j],x[m]));
            long minY = Math.min(Math.min(y[i],y[u]),Math.min(y[j],y[m]));
            long maxX = Math.max(Math.max(x[i],x[u]),Math.max(x[j],x[m]));
            long maxY = Math.max(Math.max(y[i],y[u]),Math.max(y[j],y[m]));
            if(minX==maxX||minY==maxY)continue;
            int cnt=0;
            for(int l=0;l<n;l++){
              if(minX<=x[l]&&x[l]<=maxX&&minY<=y[l]&&y[l]<=maxY)cnt++;
            }
            if(cnt>=k)num = Math.min(num,(maxX-minX)*(maxY-minY));
          }
        }
      }
    }
    System.out.println(num);
  }
}

import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();
      int d=sc.nextInt();

      int[][] x = new int[n][d];

      for(int i=0;i<n;i++){
        for(int j=0;j<d;j++){
          x[i][j]=sc.nextInt();
        }
      }

      double iii = 0;
      int cnt=0;

      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          iii=0;
          for(int k=0;k<d;k++){
            iii += Math.pow(x[i][k]-x[j][k],2);
          }
          iii = Math.sqrt(iii);
          if(iii==(int)iii){
            cnt++;
          }
        }
      }

      System.out.println(cnt);

    }
}

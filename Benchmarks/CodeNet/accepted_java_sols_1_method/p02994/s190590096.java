import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N=sc.nextInt();
      int L=sc.nextInt();

      int tasteN=0;
      int tasteN1=0;
      int[] app = new int[N+1];
      int[] dif = new int[N+1];

      int num=0;
      int min=999999;

      for(int i=1;i<=N;i++){
        tasteN+=L+i-1;
      }

      for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
          if(j!=i){
            tasteN1+=L+j-1;
          }
        }
        app[i]=tasteN1;
        tasteN1=0;
      }

      for(int i=1;i<=N;i++){
        dif[i]=Math.abs(tasteN-app[i]);
      }

      for(int i=1;i<=N;i++){
        if(dif[i]<min){
          min=dif[i];
          num=i;
        }
      }


      System.out.println(app[num]);

    }
}

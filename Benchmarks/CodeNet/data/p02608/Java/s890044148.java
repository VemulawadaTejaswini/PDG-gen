import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      
      int[] answer = new int[10050];
      for(int i=0;i<106;i++){
        for(int j=0;j<106;j++){
          for(int k=0;k<106;k++){
            int v = i*i+j*j+k*K+i*j+j*k+k*i;
            if(v<10050){
              answer[v]++;
            }
          }
        }
      }
      
      for(int i=1;i<N;i++){
        System.out.println(String.valueOf(answer[v]));
      }
    }
}
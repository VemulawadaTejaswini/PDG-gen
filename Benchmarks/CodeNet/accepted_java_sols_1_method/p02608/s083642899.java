import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      
      int[] answer = new int[10050];
      for(int i=1;i<106;i++){
        for(int j=1;j<106;j++){
          for(int k=1;k<106;k++){
            int v = i*i+j*j+k*k+i*j+j*k+k*i;
            if(v<10050){
              answer[v] = answer[v]+1;
            }
          }
        }
      }
      
      for(int i=0;i<N;i++){
        System.out.println(String.valueOf(answer[i+1]));
      }
    }
}
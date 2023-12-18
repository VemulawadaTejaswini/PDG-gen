import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int miti[] = new int[N];
      
      for(int i=0;i<M;i++){
       miti[sc.nextInt()-1] +=1;
       miti[sc.nextInt()-1] +=1;
      }
      
      for(int i=0;i<N;i++){
        System.out.println(miti[i]);
      }

      
    }
}
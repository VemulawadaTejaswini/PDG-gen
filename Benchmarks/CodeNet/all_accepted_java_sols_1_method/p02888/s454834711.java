import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] L = new int[n];
      for(int i=0;i<n;i++){
        L[i] = Integer.parseInt(sc.next());
      }

      Arrays.sort(L);

      int cnt = 0;

      for(int i=0;i<n-2;i++){
        for(int j=i+1;j<n-1;j++){
          for(int k=j+1;k<n;k++){
            boolean a = (L[i]<(L[j]+L[k]));
            boolean b = (L[j]<(L[k]+L[i]));
            boolean c = (L[k]<(L[i]+L[j]));
            if(a && b && c){
              cnt++;
            }
            int sa1=0;
            if(!a){
              sa1 = L[i]-L[j]-L[k];
            }
            i += sa1;
            if(j>=n-1 || i>=n-2){
              break;
            }
          }
          if(i>=n-2){
            break;
          }
        }
      }


      System.out.println(cnt);

    }
}

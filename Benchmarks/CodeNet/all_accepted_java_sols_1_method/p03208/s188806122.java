import java.util.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
    int k=sc.nextInt();
    int h[]=new int[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }

    int dif=1000000000;

    Arrays.sort(h);
    for(int i=0;i<=n-k;i++){
      if(dif>h[i+k-1]-h[i]){
        dif=h[i+k-1]-h[i];
      }
    }
    System.out.println(dif);

	}
}

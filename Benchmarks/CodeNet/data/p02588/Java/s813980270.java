import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int k = 0;
    Double[] kazu = new Double[N];
    for (int i=0; i<N; i++) {
    	kazu[i]=sc.nextDouble();
    }
    for (int i=0; i<N; i++){
      int j=i+1;
      while (j<N){
        Double seki=(kazu[i]*10)*(kazu[j]*10);
        if ((seki/100 == Math.floor(seki/100)) && !Double.isInfinite(seki/100)) {
            k=k+1;
        }
        j=j+1;
      }
    }
    System.out.println(k);
  }
}
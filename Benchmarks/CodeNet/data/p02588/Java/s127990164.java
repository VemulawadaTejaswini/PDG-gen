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
        Double seki=kazu[i]*kazu[j];
        if ((seki == Math.floor(seki)) && !Double.isInfinite(seki)) {
            k=k+1;
        }
        j=j+1;
      }
    }
    System.out.println(k);
  }
}
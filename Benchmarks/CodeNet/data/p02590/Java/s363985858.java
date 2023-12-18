import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int total = 0;
    int[] kazu = new int[N];
    for (int i=0; i<N; i++) {
    	int kazu[i]=sc.nextInt();
    }
    for (int i=0; i<N; i++){
      int j=i+1;
      if (kazu[i]>0) {
        while (j<N){
          int seki=kazu[i]*kazu[j];     
          total = total + seki%200003;
          j=j+1;
        }
      }
    }
    System.out.println(total);
  }
}
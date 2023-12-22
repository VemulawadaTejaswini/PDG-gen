import java.util.Scanner;
public class Main{ 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    while(true){                      
      int n = sc.nextInt();
      if(n==0){
        break;
      }
      double a,Sum=0,Sum2=0,Ave,Ave2;
      int i=0,h=0;
      double [] S;
      double [] S2;
      S = new double[1000];
      S2 = new double[1000];
      while(i<n){
        S[i] = sc.nextInt();
        Sum = Sum + S[i];
        i++;
      }
      Ave = Sum / n;
      while(h<n){
        S2[h] = Math.pow(S[h] - Ave,2);
        Sum2 = Sum2 + S2[h];
        h++;
      }
      Ave2 = Sum2 / n;
      a = Math.sqrt(Ave2);
      System.out.printf("%f\n",a);
    }
  }
}
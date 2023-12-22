import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n ;
    int m;
    n = sc.nextInt();
    m = sc.nextInt();
    double[] A = new double[n];
    int i;
    double sum;
    sum = 0;
    for(i=0; i < n ;i++){
      A[i] = sc.nextDouble();
      sum += A[i];
    }
    double counter = 0;
    double rate = sum /(4 * m);
    for(i=0 ; i<n ; i++){
      if(A[i] >= rate){
        counter++;
      }else{
        continue;
      }
    }
    if(counter >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

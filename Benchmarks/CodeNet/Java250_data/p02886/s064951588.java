import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int S1 =0;
    int S2 = 0;
    for( int i =  0; i < n; i++) {
      S1 += a[i]*a[i];
    }
    for(int i = 0; i< n;i++) {
      S2 += a[i];
    }
    System.out.println(((S2)*(S2)-S1)/2);
    
    
    
    
    
  }
}

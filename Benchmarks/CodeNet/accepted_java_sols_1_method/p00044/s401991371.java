import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] prime = new int[60000];
    for(int i=0; i<60000; i++) {
      prime[i]=0;
    }
    for(int i=2; i<60000; i++) {
      if(prime[i] == 1) {
        continue;
      }
      prime[i] = 2;
      int j=i+i;
      while(j<60000) {
        prime[j]=1;
        j+=i;
      }
    }
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int n = sc.nextInt();
      int lower=0;
      for(int i=n-1;i>0;i--) {
        if(prime[i]==2) {
          lower=i;
          break;
        }
      }
      int upper=0;
      for(int i=n+1;i<60000;i++) {
        if(prime[i]==2) {
          upper=i;
          break;
        }
      }
      System.out.print(lower);
      System.out.print(" ");
      System.out.println(upper);
    }
  }
}
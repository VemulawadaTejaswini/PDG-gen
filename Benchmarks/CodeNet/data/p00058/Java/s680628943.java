import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] prime = new int[10000000];
    for(int i=0;i<10000000;i++) {
      prime[i]=0;
    }
    for(int i=2; i<10000000; i++) {
      if(prime[i]==1) {
        continue;
      }
      prime[i]=2;
      int j=i+i;
      while(j<10000000) {
        prime[j]=1;
        j+=i;
      }
    }
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int n = sc.nextInt();
      if(n==0) {
        break;
      }
      int i=0;
      int j=0;
      int sum=0;
      while(i<n) {
        if(prime[j]==2) {
          sum+=j;
          i++;
        }
        j++;
      }
      System.out.println(sum);
    }
  }
}
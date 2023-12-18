import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int m = stdIn.nextInt();
    int[] s = new int[m];
    int[] p = new int[m];

    for(int i=0; i<m; i++) {
      int k = stdIn.nextInt();
      for(int j=0; j<k; j++) {
        int a = stdIn.nextInt();
        s[i] += Math.pow(2,a-1);
      }
    }

    for(int i=0; i<m; i++) {
      p[i] = stdIn.nextInt();
    }

    int N = (int)Math.pow(2,n);


    int ans = 0;
    for(int i=0; i<N; i++) {
      int flag = 1;
        for(int j=0; j<m; j++) {
          int cnt = i&s[j];
          int bits = 0;
          while(cnt != 0) {
            if((cnt&1) == 1) { bits++; }
            cnt >>>= 1;
          }
          if(bits%2 != p[j]) {
            flag = 0;
            break;
          }
        }
      if(flag == 1) { ans++; }
    }

    System.out.println(ans);
  }
}

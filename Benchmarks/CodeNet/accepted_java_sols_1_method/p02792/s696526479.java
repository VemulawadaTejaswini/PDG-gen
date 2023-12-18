import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nLen = String.valueOf(n).length();
    
    long count = 0;
    for (int i=1; i<=n; i++) {
      int afirst = Integer.parseInt(String.valueOf(i).substring(0, 1));
      int alast = i%10;
      if (alast==0) {
        continue;
      }
      
      
      for (int j=1; j<=nLen; j++) {
        int mid = 0;
        if (j==1) {
          if (afirst==alast) {
            count++;
          }
        }
        else if (j==2) {
          if (alast*10+afirst<=n) {
            count++;
          }
        }
        else if (j==3) {
          mid = 90;
        }
        else if (j==4) {
          mid = 990;
        }
        else if (j==5) {
          mid = 9990;
        }
        else if (j==6) {
          mid = 99990;
        }
        
        if (j>2) {
          int bmax = alast*(int)Math.pow(10,j-1) + mid + afirst;
          if (bmax<=n) {
            count += Math.pow(10, j-2);
          }
          else {
            int b = alast*(int)Math.pow(10, j-1) + afirst;
            while (b<=n) {
              count ++;
              b += 10;
            }
          }
        }
      }
    }
    System.out.println(count);
    
  }
}
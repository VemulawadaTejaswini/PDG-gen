import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //splitを使うことでStringがそれぞれ入る。
    String S[] = sc.next().split("");
    //＋の位置の場合は２の(n-1)乗
    int n = (int)Math.pow(2,3);
    
    String[] f = new String[3];
    long total = 0;
    for (int i = 0; i < n; i++) {
    	total = Long.parseLong(S[0]);
      for (int j = 0; j < 3; j++) {
        if ((i>>j & 1) == 1) {
            total += Long.parseLong(S[j+1]);
            f[j] = "+";
        } else {
        	
        	total -= Long.parseLong(S[j+1]);
        	f[j] = "-";	
       
        }
      }
      if(total == 7) break;
      
    }
    System.out.print(S[0]);
    for(int i = 0;i<3;i++) {
    	System.out.print(f[i]+S[i+1]); 
    }
    System.out.print("="+7);
  }
}

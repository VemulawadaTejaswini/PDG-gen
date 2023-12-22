import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B= sc.nextInt(), C= sc.nextInt(), D= sc.nextInt(),
    E= sc.nextInt(), t=0, last = 0;
    int a = A % 10, b = B % 10, c = C % 10, d = D % 10, e = E % 10;
    if(a == 0 && b == 0 && c == 0 && d== 0 && e== 0) {
      t = A + B + C + D + E;
    } else {
      int[] X = { a, b, c, d, e }; 
      Arrays.sort(X);
      for(int i= 0; i<5; i++) {
        if(X[i] != 0) {
          last = X[i];
          break;
        }
      }
      if(a==0) {
        t += A;
      } else {
        t = t + A - a + 10;
      }
      if(b==0) {
        t += B;
      } else {
        t = t + B - b + 10;
      }
      if(c==0) {
        t += C;
      } else {
        t = t + C - c + 10;
      }
      if(d==0) {
        t += D;
      } else {
        t = t + D - d + 10;
      }
      if(e==0) {
        t += E;
      } else {
        t = t + E - e + 10;
      }
      t = t-10 + last;
    }
    System.out.println(t);
  }
}
import java.util.*;
class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      long A = sc.nextLong();
      long B = sc.nextLong();
      long C = sc.nextLong();
      long D = sc.nextLong();
      
      if(A >= 0 && B >= 0 && C >= 0 && D >= 0) {
          System.out.print(Math.max(A, B) * Math.max(C, D));
      }
      else if(A >= 0 && B >= 0 && C < 0 && D < 0) {
          System.out.print(Math.min(A, B) * Math.max(C, D));
      }
      else if(A < 0 && B < 0 && C >= 0 && D >= 0) {
          System.out.print(Math.max(A, B) * Math.min(C, D));
      }
      else if(((A < 0 && B > 0) || (A > 0 && B < 0)) && ((C < 0 && D > 0) || (C > 0 && D < 0))) {
          long val1 = Math.max(A, B) * Math.max(C, D);
          long val2 = Math.min(A, B) * Math.min(C, D);
          long val3 = Math.max(A, B) * Math.min(C, D);
          long val4 = Math.min(A, B) * Math.max(C, D);
          
          long max1 = Math.max(val1, val2);
          long max2 = Math.max(val3, val4);
          
          System.out.print(Math.max(max1, max2));
      }
    }
}
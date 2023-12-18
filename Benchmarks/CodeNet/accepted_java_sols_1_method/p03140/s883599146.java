import java.util.*;

class Main {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  
  int N = sc.nextInt();
  String A = sc.next();
  String B = sc.next();
  String C = sc.next();
  
  int sum = 0;
  for(int i = 0;i < N;i++) {
    if(A.charAt(i) == B.charAt(i)) {
      if(A.charAt(i) == C.charAt(i)) {
      } else {
        sum += 1;
      }
    } else {
      if(B.charAt(i) == C.charAt(i)) {
        sum += 1;
      } else {
        if(A.charAt(i) == C.charAt(i)) {
        	sum += 1;
        } else {
          sum += 2;
        }
      }
    }
  }
  
  System.out.println(sum);
}
}
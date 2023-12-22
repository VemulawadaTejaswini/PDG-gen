import java.util.*;
class Main {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int N = sc.nextInt();
  int A = sc.nextInt();
  int B = sc.nextInt();
  
  int max,min;
  
  if(A > B) { 
    max = B;
  } else {
    max = A;
  }
  
  if(N < A + B) {
    min = A + B - N;
  } else {
    min = 0;
  }
  
  System.out.println(max + " " + min);
}
}
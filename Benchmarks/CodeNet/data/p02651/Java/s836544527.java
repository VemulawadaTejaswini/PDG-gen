import java.util.Scanner;

public class Main{
  public static void main(String...args) {
    try (Scanner sc = new Scanner(System.in)) {
      int T = sc.nextInt();
      int xor_result = 0;
      
      for(int i = 0; i < T; i++) {
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int j = 0; j < N; j++){
          A[j] = sc.nextInt();
        }
        String S = sc.next();
        xor_result = calc(xor_result, N, A, S, 0);
        if(xor_result == 0)
          System.out.println("0");
        else
          System.out.println("1");
      }
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  public static int calc(int r, int n, int[] a, String s, int index) {
    int temp = r;
    if(n == index)
      return r;
    int a_case = a[index];
    String s_case = s.substring(index,index+1);
    index += 1;
  
    if("1".equals(s_case)) {
    
      if(r != 0){
        if(!s.substring(index-1).contains("0")){
          return r;
        }
      }
      
      if(r == 0){
        temp = r^a_case;
        temp = calc(temp, n, a, s, index);
      } else {
        temp = calc(r, n, a, s, index);
        if(temp != 0)
          temp = calc(r, n, a, s, index);
      }
    } else {
    
      if(r == 0){
        if(!s.substring(index-1).contains("1")){
          return 0;
        }
      }
    
      if(r != 0){
        temp = r^a_case;
        temp = calc(temp, n, a, s, index);
        if(temp != 0)
          temp = calc(r, n, a, s, index);
      }else{
        temp = calc(r, n, a, s, index);
      }
    }
    return temp;
  }
}
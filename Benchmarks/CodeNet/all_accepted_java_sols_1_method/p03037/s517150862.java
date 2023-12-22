import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N,M,count;
        int L;
        int R;
        int A,B;

        count = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();
        
        for(int i = 0; i < M - 1; i++) {
           A = sc.nextInt();
           B = sc.nextInt();
           if(L < A) {
              L = A;
           }
           if(R > B) {
              R = B;
           }   
        }
        if(R >= L) {
          count = R - L + 1;
        }else { 
          count = 0;
        }
        
      

        System.out.println(count);
    }
}
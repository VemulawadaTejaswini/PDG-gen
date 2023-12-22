import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String S ="";
    int[][] A = new int[3][3]; //3*3行列
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    
    int N = sc.nextInt(); //b => 3*3行列 => 1
    for (int i = 0; i < N; i++) {
      int b = sc.nextInt();
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if(b == A[j][k]) {
            A[j][k] = 0;
          }
        }
      }
    }
    
    // (0,0)|(0,1)|(0,2)
    // (1,0)|(1,1)|(1,2)
    // (2,0)|(2,1)|(2,2)
    
    if(A[0][0]==0 && A[0][1]==0 && A[0][2]==0){
      S="Yes";
    } else if(A[1][0]==0 && A[1][1]==0 && A[1][2]==0){
      S="Yes";
    } else if(A[2][0]==0 && A[2][1]==0 && A[2][2]==0){
      S="Yes";
    } else if(A[0][0]==0 && A[1][0]==0 && A[2][0]==0){
      S="Yes";
    } else if(A[0][1]==0 && A[1][1]==0 && A[2][1]==0){
      S="Yes";
    } else if(A[0][2]==0 && A[1][2]==0 && A[2][2]==0){
      S="Yes";
    } else if(A[0][0]==0 && A[1][1]==0 && A[2][2]==0){
      S="Yes";
    } else if(A[0][2]==0 && A[1][1]==0 && A[2][0]==0){
      S="Yes";
    } else {
      S="No";
    }
    System.out.println(S);
  }
}
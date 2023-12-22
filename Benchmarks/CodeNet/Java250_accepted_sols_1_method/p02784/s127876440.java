import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int M = sc.nextInt();
    
    int A[] = new int[M];
    int S = 0;
    for(int i = 0;i < M;i++){
        A[i] = sc.nextInt();
        S += A[i];
    }
    if(S >= H){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
  }
}
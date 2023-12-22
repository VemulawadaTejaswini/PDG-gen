import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());  
    int[] A = new int[N];
    for(int i = 0; i<N; i++){
        int index = Integer.parseInt(sc.next()) - 1;
        A[index] = i + 1;
    } 
    for(int i = 0; i<N; i++){
        System.out.print(A[i] + " ");
    }

  }
}


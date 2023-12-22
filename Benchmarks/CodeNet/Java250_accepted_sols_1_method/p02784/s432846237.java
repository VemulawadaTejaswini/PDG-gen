import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    int N = sc.nextInt();
    sc.nextLine();
    String tmp = sc.nextLine();
    String Spl[] = tmp.split(" ");
    int A[] = new int[N];
    long ans = 0;
    for (int i=0;i<N;i++){
      A[i] = Integer.parseInt(Spl[i]);
      ans += A[i];
    }
    if (H<=ans){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }      
  }
}

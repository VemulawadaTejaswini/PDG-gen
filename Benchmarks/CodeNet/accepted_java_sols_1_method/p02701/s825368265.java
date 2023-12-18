import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    String[] S  = new String[N];
    for (int i = 0; i < N; i++){
      S[i] = sc.next().strip();
    }
    int ans = 1;
    Arrays.sort(S);
    for(int i = 0; i < N-1;i++){
      if (!S[i].equals(S[i+1])){
        ans++;
      }
    }

    System.out.println(ans);

    
    
  }
}
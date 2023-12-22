import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    //ここから4行配列として数列を受け取る
    Integer a[] = new Integer[N];
    for(int i = 0; i < N; i++){
      a[i] = sc.nextInt();
    }
    //配列を降順に並び替える
    Arrays.sort(a, Comparator.reverseOrder());

    for(int i = 1; i < N; i++){
      if(a[i-1].equals(a[i])){
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
    return;
  }
}

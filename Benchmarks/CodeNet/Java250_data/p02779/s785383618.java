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
    
    int count = 0;
    //隣あう配列が同じならcountを＋１する
    for(int i = 1; i < N; i++){
      if(a[i-1].equals(a[i])){
        count++;
      }
    }
    
    //countが0以外ならNOを返す
    if(count == 0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

}
}

import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();//500円玉
    int b = sc.nextInt();//100円玉
    int c = sc.nextInt();//50円玉
    int x = sc.nextInt();//目標額
    int ans = 0;

for(int i = 0; i <= a; i++){
  for (int j = 0; j <= b; j++) {
    for(int k = 0; k <= c; k++){
      if((500*i + 100*j + 50*k) == x){
        ans++;
      }
    }
  }
}
    System.out.println(ans);
}
}

import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int L = sc.nextInt();
sc.close();
 
int ans = 0;
if (L >= 0) {
  for (int i = 2; i <= N; i++) {
    ans += (i + L - 1);
  }
} else if (-L >= N) {
  for (int i = 1; i <= N - 1; i++) {
    ans += (i + L - 1);
  }
} else {
 for (int i = 1; i <= N; i++) {
    ans += (i + L - 1);
  }
}

System.out.println(ans);
}
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
	int[]a={105,135,165,189,195};
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
      int an=0;
      for(int i=0;i<5&&a[i]<=line;i++){
      	an++;
      }
        System.out.println(an);
    }
}
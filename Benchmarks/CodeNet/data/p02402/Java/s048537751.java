import java.util.Scanner;
public class Main {public static void main(String[] args) {Scanner sc = new Scanner(System.in);int n = sc.nextInt();long sum =0;int max = -10000000;int min = 10000000;for (int i = 1; i <= n; i++) {int a = sc.nextInt();
sum += a; if(max < a){max = a;}if(min > a){min = a;}}System.out.printf("%d %d %d\n", min, max, sum);}}

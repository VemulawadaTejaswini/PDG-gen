import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
try (Scanner sc = new Scanner(System.in)) {
while (true) {
int n = sc.nextInt();
if (n == 0) { break; }
int[] scores = new int[n];
for (int i = 0; i < scores.length; i++) {
scores[i] = sc.nextInt();
}
double average = 0, variance = 0, sum = 0, ssum = 0;
for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
}
average = sum/scores.length;
for (int i = 0; i < scores.length; i++) {
    ssum += ((scores[i] - average)*(scores[i] - average));
}
variance = ssum/scores.length;
// … 平均値averageと，分散varianceを計算しよう …
System.out.println(Math.sqrt(variance));
}
}
}
}

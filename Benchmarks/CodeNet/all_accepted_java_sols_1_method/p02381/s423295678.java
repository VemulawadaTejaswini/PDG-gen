import java.util.Scanner;

public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
int i;
try (Scanner sc = new Scanner(System.in)) {
while (true) {
int n = sc.nextInt();
if (n == 0) { break; }
int[] scores = new int[n];
for (i = 0; i < scores.length; i++) {
scores[i] = sc.nextInt();
}
double average = 0, variance = 0, sum = 0;

for(i=0;i<n;i++){
    sum = sum+scores[i];
}
average=sum/n;
for(i=0;i<n;i++){
variance=variance+(scores[i]-average)*(scores[i]-average);
}
variance=variance/n;
// … 平均値averageと，分散varianceを計算しよう…
System.out.println(Math.sqrt(variance));
}
}
}
}

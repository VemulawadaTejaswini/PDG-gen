import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
Scanner sc= new Scanner(System.in);
while(true) {
int n = sc.nextInt();
if (n == 0) { break; }
int[] scores = new int[n];
for(int i= 0; i< scores.length; i++) {
scores[i] = sc.nextInt();
}
double average = 0, variance = 0;
int i=0;
// … 平均値averageと，分散varianceを計算しよう…
for(i=0;i<scores.length;i++){
	average=average+scores[i];
}
average=average/i;
for(i=0;i<scores.length;i++){
	variance=variance+(scores[i]-average)*(scores[i]-average);
}
variance=variance/n;

System.out.println(Math.sqrt(variance));
}
}
}
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
while (true) {
int n = sc.nextInt();
if (n == 0) { break; }
int[] scores = new int[n];
for (int i = 0; i < scores.length; i++) {
scores[i] = sc.nextInt();
}
double average = 0, variance = 0;
for(int i1=0;i1<n;i1++){
	average=average+scores[i1];
}
average=average/n;
for(int i2=0;i2<n;i2++){
	variance=variance+(average-scores[i2])*(average-scores[i2]);
}
variance=variance/n;
System.out.println(Math.sqrt(variance));
}
}
}
}

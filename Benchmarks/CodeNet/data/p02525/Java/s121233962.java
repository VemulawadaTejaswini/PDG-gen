import java.util.Scanner;
public class Main {
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
while (true){
int n = sc.nextInt();
if (n == 0) { break; }
int[] scores = new int[n];
for (int i = 0; i < scores.length; i++) {
scores[i] = sc.nextInt();
}
double a=0,b=0,average = 0, variance = 0;
for(int i=0,i<n,i++){
a=a+scores[i];
}
average=a/n;
for(int i=0;i<n;i++){
b=b+Math.pow(scores{i)-average,2);
}
variance=a/n;
System.out.println(Math.sqrt(variance));
}
}
}
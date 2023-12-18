import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int i;
try (Scanner sc = new Scanner(System.in)) {
while (true) {
int n = sc.nextInt();
if (n == 0) { break; }
int[] s = new int[n];
for (i = 0; i < s.length; i++) {
s[i] = sc.nextInt();
}
double average = 0, variance = 0, sum = 0;
for(i=0; i<n; i++){
    sum += s[i];
}
average = sum/n;
for(i=0; i<n; i++){
variance += (s[i]-average)*(s[i]-average);
}
variance = variance/n;
System.out.println(Math.sqrt(variance));
}
}
}
}

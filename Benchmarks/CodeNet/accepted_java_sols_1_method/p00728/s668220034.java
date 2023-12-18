import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while (true) {
int n = sc.nextInt();
if (n == 0) {
break;
}
int[] values = new int[n];
for (int i = 0; i < n; i++) {
values[i] = sc.nextInt();
}
int min = 1000, max = 0;
for (int i = 0; i < n; i++) {
if (values[i] >= max) {
max = values[i];
}
if (values[i] <= min) {
min = values[i];
}
}
double tot = 0;
for (int i = 0; i < n; i++) {
tot += values[i];
}
tot -= (max + min);
double ave =tot/( n - 2);
System.out.println((int) ave);
}
}
}
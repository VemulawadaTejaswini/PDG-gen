import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
int[] a = new int[n];

for(int i = n;i>0;i--){
System.out.println(a[i]);
for(int j = n;i>1;i--){
System.out.print(" ");
}
}}}
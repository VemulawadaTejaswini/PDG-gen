import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  System.out.println((int)((1800*M + 100*N)*Math.pow(2,M)));
}}

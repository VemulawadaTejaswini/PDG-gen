import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N=s.nextInt();
    int M=s.nextInt();
    int X=N*(N-1)/2;
    int Y=M*(M-1)/2;
    System.out.println(X+Y);
}}
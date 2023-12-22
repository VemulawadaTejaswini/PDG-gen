import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    System.out.println((A>B)?A+A-1:(A==B)?A+B:B+B-1);
  }
}
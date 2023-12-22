import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 1;
    int i = 0;
    while(sum < b){
      sum--;
      sum+=a;
      i++;
    }
    System.out.println(i);
  }
}
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int hp = sc.nextInt();
    int num = sc.nextInt();
    int sum = 0;
    for(int i = 0; i < num; i++){
      sum += sc.nextInt();
    }
    System.out.println(sum >= hp ? "Yes" : "No");
  }
}
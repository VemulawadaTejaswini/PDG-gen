import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double counter = 0;
    for(int i = 0;i <= a;i++){
      int b = i % 2;
      if(b == 1){
        counter++;
      }
    }
    System.out.println(counter/(double)a);
  }
}
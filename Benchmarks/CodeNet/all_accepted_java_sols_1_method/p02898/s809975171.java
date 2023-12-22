import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c[] = new int[a];
    int counter = 0;                   
    for(int i = 0;i < c.length;i++){
      c[i] = sc.nextInt();
      if(c[i] >= b){
        counter++;
      }
    }
    System.out.println(counter);                   
  }
}
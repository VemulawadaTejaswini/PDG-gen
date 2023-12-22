import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String b = sc.next();
    char c[] = b.toCharArray();
    int counter = 0;
    for(int j = 1;j < c.length;j++){
      if(c[j-1]==c[j]){
        counter++;
      }
    }
        System.out.println(a-counter);
  }
}
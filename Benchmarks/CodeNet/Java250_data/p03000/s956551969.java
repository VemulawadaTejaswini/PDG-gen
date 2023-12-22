import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

    int sum = 0;
    int count = 0;
    for(int i = 0; i < a; i++){
      int c =s.nextInt();
      sum = c + sum;
      if(sum <= b){
        count++;
      }else{

      }
    }
    System.out.println(count + 1);
  }
}

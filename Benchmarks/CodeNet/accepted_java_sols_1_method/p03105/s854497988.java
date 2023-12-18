import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int sum = b/a;

    if(sum > c ){
      System.out.println(c);
    }else{
      System.out.println(sum);
    }

}
}

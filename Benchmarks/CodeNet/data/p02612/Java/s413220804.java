import java.util.Scanner;
public class Main{
  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for(int i=0;;i++){
      if(n <= 1000*i){
        System.out.println(1000*i - n);
        break;
      }
    }
  }
}
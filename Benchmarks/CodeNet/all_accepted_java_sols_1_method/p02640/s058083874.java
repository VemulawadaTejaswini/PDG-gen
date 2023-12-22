import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int X = scan.nextInt();
      int Y = scan.nextInt();
      String ans = "No";
      for(int i = 0;i < 101;i++){
          for(int j = 0;j < 101;j++){
              if(i + j == X)
                if(i * 2 + j * 4 == Y){
                    ans = "Yes";
                    break;
                }
          }
        }
      System.out.println(ans);
    }
}
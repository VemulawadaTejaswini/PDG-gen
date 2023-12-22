import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int N =sc.nextInt();
      
      
      for(int i=1; i<=9; i++)for(int a=1; a<=9; a++){

        if(i*a==N){
        System.out.println("Yes");
          return;
        }
      }
        System.out.println("No");
    }
}
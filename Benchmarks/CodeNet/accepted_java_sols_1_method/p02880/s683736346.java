import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	boolean flag = false;
      	for(int i = 1; i < 10; i++){
          for(int j = 1; j < 10; j++){
            if(i*j == n) flag = true;
          }
        }
      
      	if(flag)
          System.out.println("Yes");
      	else
          System.out.println("No");

	}
}
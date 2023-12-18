import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = sc.nextInt();
        
		//System.out.println(N+" "+M);
      String result ="No";
      for(int i = 1 ; i < 10;++i){
        if(N % i == 0){
          int remainder = N / i; 
          if(remainder > 0 && remainder < 10){
          	result = "Yes";
          } 
        }
      }
		System.out.println( result);
    }


}

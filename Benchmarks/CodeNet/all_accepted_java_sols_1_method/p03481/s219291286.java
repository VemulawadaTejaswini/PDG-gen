import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long X = sc.nextLong();
	  Long Y = sc.nextLong();
	  int cnt = 0;
	  for (long num = X; num <= Y; num=2*num) { 
        if(num > Y) {
			 break;
		 }
        cnt++;
	  }
	  System.out.println(cnt);
	}

}
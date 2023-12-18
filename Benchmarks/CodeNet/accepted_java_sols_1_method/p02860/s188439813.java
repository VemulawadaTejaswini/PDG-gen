import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      sc.nextLine();
      	String line = sc.nextLine();
    
      	if(line.substring(0, n/2).equals(line.substring(n/2, line.length())))
           System.out.println("Yes");
        else
           System.out.println("No");
      
	}
}
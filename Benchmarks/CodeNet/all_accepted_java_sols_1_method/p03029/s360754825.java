import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int appleNum = sc.nextInt();
      	int pieces	 = sc.nextInt();
      
      	pieces = (appleNum * 3) + pieces;
      	int applePie = pieces / 2;
      	System.out.println(applePie);
  
  
    }
}
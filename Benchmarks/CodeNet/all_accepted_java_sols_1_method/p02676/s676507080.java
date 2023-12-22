import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		int k = sc.nextInt();
      	String s = sc.next();
      	String result = "";
      	if(s.length() <= k){
          result = s;
        }else{
          result = s.substring(0,k) + "...";
        }
      System.out.println(result);
}
}


import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
      	int lowPos = sc.nextInt();
      	String str = sc.next();
      
      	String[] ary = str.split("", 0);
      	for(int i = 0; i < length; i++) {
        	if(i == lowPos -1 ) ary[i] = ary[i].toLowerCase();
          	System.out.print(ary[i]);
        }
    }
}
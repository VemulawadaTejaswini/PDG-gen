import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner reader=new Scanner(System.in);
    int a =reader.nextInt();
    int b =reader.nextInt();
    int c =reader.nextInt();
	
    if((b-a)==(c-b)) {
    	System.out.println("YES");
    }
    else {
    	System.out.println("NO");
    }
	}
	

}

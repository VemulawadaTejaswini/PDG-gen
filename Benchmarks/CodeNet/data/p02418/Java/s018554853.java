import java.util.*;

public class Main{
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
		  String s = sc.nextLine();
		  String a = s+s;
//		  System.out.println(a);	
		  String p = sc.nextLine();

				  if(a.contains(p)){
					  System.out.println("Yes");					  
				  }else{
					  System.out.println("No");	
				  }
	  }
}


import java.util.*;

public class Main{
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
		  String str1 = sc.nextLine();  
		  int sum = 0;
		  
		  while(true){
			  String str2 = sc.nextLine(); 
			  if(str2.equals("END_OF_TEXT"))break;
			  for(String a:str2.split(" ")){
				  if(a.equalsIgnoreCase(str1)){
					  sum++;					  
				  }
			  }
		  }
		  System.out.println(sum);
	  }
}


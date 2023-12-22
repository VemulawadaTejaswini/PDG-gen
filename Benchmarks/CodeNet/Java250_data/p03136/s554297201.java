import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

			  Scanner scanner = null;
		      scanner = new Scanner(System.in);

		      int A = scanner.nextInt();
		      List<Integer> B =  new ArrayList<>();
		      
		      try{
		    	  while(true){
		    		  B.add(scanner.nextInt());  
		    	  }
		      } catch(Exception e){
		      }
		      
		      B = B.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		      
		      int maxL = 0;
		      int etcL = 0;
		      for (int i = 0; A != i ; i++) {
		    	  if (i == 0) {
		    		  maxL = B.get(i);
		    	  } else {
		    		  etcL += B.get(i); 
		    	  }
		      }
		      
		      if (etcL > maxL ) {
		    	  System.out.println("Yes");
		      } else {
		    	  System.out.println("No");
		      }
		}

}


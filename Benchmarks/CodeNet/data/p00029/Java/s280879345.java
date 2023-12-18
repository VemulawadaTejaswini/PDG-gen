import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  while(sc.hasNext()) {
				  String str=sc.nextLine();
				  String[] tokens=str.split(" ");
				  int[] count=new int[1010];
				  int max=0, lengthmax=0;
				  
				  for(int i=0; i<tokens.length; i++) {
					  if(tokens[i].length()>lengthmax) {
						  lengthmax=tokens[i].length();
					  }
					  for(int j=i+1; j<tokens.length; j++) {
						  if(tokens[i].equals(tokens[j])) {
							  count[i]++;
							  max=Math.max(count[i], max);
						  }
					  }
				  }
				  for(int i=0; i<tokens.length; i++) {
					  if(count[i]==max) {
						  System.out.print(tokens[i]);
						  break;
					  }
				  }
				  System.out.print(" ");
				  for(int i=0; i<tokens.length; i++) {
					  if(lengthmax==tokens[i].length()) {
						  System.out.println(tokens[i]);
						  break;
					  }
				  }
			  }
		  }
	}
}

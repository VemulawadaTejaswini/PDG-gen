import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  while(sc.hasNext()) {
				  String line=sc.nextLine();
				  String[] tokens=line.split("[,. ]");
				  int count=0;
				  for(String t:tokens) {
					  if(t.length()>=3 && t.length()<=6) {
						  if(count>0)System.out.print(" ");
						  System.out.printf("%s", t);
						  count++;
					  }
				  }
				  System.out.printf("\n");
			  }
		}
	}
}


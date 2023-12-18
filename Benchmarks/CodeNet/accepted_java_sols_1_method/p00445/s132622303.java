import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  while(sc.hasNext()) {
				  String str=sc.next();
				  String s;
				  int joicount=0, ioicount=0;
				  for(int i=0; i<str.length()-2; i++) {
					  s=str.substring(i, i+3);
					  if(s.equals("JOI")) joicount++;
					  else if(s.equals("IOI")) ioicount++;
				  }
				  
				  System.out.println(joicount);
				  System.out.println(ioicount);
			  }
		}
	}
}


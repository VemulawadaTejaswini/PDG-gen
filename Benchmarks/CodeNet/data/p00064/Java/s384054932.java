import java.util.Scanner;

public class Main{
		public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  int ans=0;
			  while(sc.hasNext()) {
				  String str=sc.nextLine();
				  String[] tokens=str.split("[^0-9]");
				  for(String t:tokens) {
					  if(t.length()>0) {
						  ans+=Integer.valueOf(t);
					  }
				  }
			  }
			  System.out.println(ans);
		  }
	}
}

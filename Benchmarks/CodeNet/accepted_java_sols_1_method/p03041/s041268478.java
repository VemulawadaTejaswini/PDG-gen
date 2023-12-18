import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 int k = std.nextInt();
		 String s = std.next();
		 String[] si = s.split("");
		 for (int i=0;i<n;i++) {
			 if(i==k-1) {
				 if(Character.isUpperCase( si[i].charAt( 0 ) )) {
					 si[i]=si[i].toLowerCase();
				 }
				 else {
					 si[i] = si[i].toUpperCase();
				 }
			 }
		 }
		 for(int i=0;i<n;i++) {
			 System.out.print(si[i]);
		 }
	 }
}

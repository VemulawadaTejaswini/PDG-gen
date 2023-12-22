import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			String strArray[] = scan.nextLine().split(" ");
			String longest = "",most = "";
			int c,r=0,l=0;

			for(String str1: strArray){
				c=0;
				for(String str2: strArray){
					if(str1.equals(str2)){
						c++;
					}
				}
				if(c>r){
					r=c;
					most=str1;
				}
				if(longest.length() < str1.length()){
					longest = str1;
				}
			}
			System.out.println(most + " " + longest);
		}

	}
}
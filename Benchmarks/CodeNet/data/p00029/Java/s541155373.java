import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			String strArray[] = scan.nextLine().split(" ");
			String longest = "", most = "";
			int c, r=0,l=0;

			for(int i=0; i<strArray.length; i++){
				c=0;
				for(int j=0; j<strArray.length; j++){
					if(i != j && strArray[i].equals(strArray[j])){
						c++;
					}
					if(strArray[i].length() > strArray[j].length()){
						longest = strArray[i];
					}
				}
				if(c>r){
					r=c;
					most = strArray[i];
				}
			}
			System.out.println(most + " " + longest);
		}
	}
}
package Problem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (sc.hasNext()) {
			String string = sc.nextLine();
			
			String[] strArray = string.split("");
			
			for (int i = 0; i < strArray.length; i++) {
			    try {
			        Integer.parseInt(strArray[i]);
			        //System.out.print(1);
			    } catch (NumberFormatException e) {
			    	strArray[i] = ":";
			    }
			}
			String str1 = "";
			for (String array : strArray) {
				str1 += array;
			}
			
			String[] split = str1.split(":");
			
			for (int i = 0; i < split.length; i++) {
			    try {
			        Integer.parseInt(split[i]);
			        sum += Integer.parseInt(split[i]);
			    } catch (NumberFormatException e) {
			    	;
			    }
			}	
			
		}
		System.out.println(sum);
	}

}
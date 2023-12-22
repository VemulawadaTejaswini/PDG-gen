import java.util.Scanner;
class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str1 = sc.next();
	    char[] strArray1 = new char[str1.length()];

	    for (int i = 0; i < str1.length(); i ++){
	    	strArray1[i] = str1.charAt(i);
	    	if (Character.isUpperCase( strArray1[i] )){
	    		System.out.print(String.valueOf(strArray1[i]).toLowerCase());

	    	} else {
	    		System.out.print(String.valueOf(strArray1[i]).toUpperCase());
	    	}
	    }

	    while (sc.hasNext()){
	    	String str = sc.next();
		    char[] strArray = new char[str.length()];
		    System.out.print(" ");

		    for (int i = 0; i < str.length(); i ++){
		    	strArray[i] = str.charAt(i);
		    	if (Character.isUpperCase( strArray[i] )){
		    		System.out.print(String.valueOf(strArray[i]).toLowerCase());

		    	} else {
		    		System.out.print(String.valueOf(strArray[i]).toUpperCase());
		    	}
		    }
	    }
	    System.out.println("");

	}

}


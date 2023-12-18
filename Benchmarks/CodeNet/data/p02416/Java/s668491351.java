import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    while (sc.hasNextLine()){

		    String i  = sc.nextLine();

		    if (i.equals("0")){
		    	break;
		    } else {

		    	String[] array = new String[i.length()];

			    int num = 0;

		    	for (int k = 0; k < i.length(); k++){
		    		array[k] = i.substring(k, k+1);
		    		num += Integer.valueOf(array[k]);
		    	}

		    	System.out.println(num);
		    }

	    }


	}

}



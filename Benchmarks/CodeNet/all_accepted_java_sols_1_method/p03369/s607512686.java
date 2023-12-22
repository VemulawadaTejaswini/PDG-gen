import java.util.Scanner;

class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

    String str;
		str = sc.nextLine();

  	int s = 700;
		int i = 0;

		while (i <= 2) {

			if (str.charAt(i) == 'o'){
	    	s = s + 100;
	    }

			i++;

		}

      	System.out.println (s);
    }
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String b = sc.next();

		String ans ="";
		switch(b){
			case "A":
				ans = "T";
				break;
			case "C":
				ans = "G";
				break;
			case "G":
				ans = "C";
				break;
			case "T":
				ans = "A";
				break;
		}

        System.out.println(ans);


	}

}


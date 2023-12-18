import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String dogName = "";
		while(n>26){
	 		dogName += numberToAlphabet(n%26);
			n=n/26;
		}
		dogName += numberToAlphabet(n);
		StringBuffer ans = new StringBuffer(dogName);
		System.out.println(ans.reverse().toString());
    }
  	
  	public static String numberToAlphabet(int num){
		switch (num){
  	case 1:
    	return("a");
  case 2:
    return("b");
  case 3:
    return("c");
  case 4:
    return("d");
  case 5:
    return("e");
  case 6:
    return("f");
  case 7:
    return("g");
  case 8:
    return("h");
  case 9:
    return("i");
  case 10:
    return("j");
  case 11:
    return("k");
  case 12:
    return("l");
  case 13:
    return("m");
  case 14:
    return("n");
  case 15:
    return("o");
  case 16:
    return("p");
  case 17:
    return("q");
  case 18:
    return("r");
  case 19:
    return("s");
  case 20:
    return("t");
  case 21:
    return("u");
  case 22:
    return("v");
  case 23:
    return("w");
  case 24:
    return("x");
  case 25:
    return("y");
  case 26:
    return("z");
                case 0:
    return("z");
}
      return("");
    }
  
}
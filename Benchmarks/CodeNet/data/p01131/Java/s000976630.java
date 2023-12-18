import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String[][] button = {{""},{".",",","!","?"," "},{"a","b","c"},{"d","e","f"},
			     {"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},
			     {"t","u","v"},{"w","x","y","z"}};
	
	int n = sc.nextInt();
	while(n!=0){
	    String line = sc.next();
	    System.out.println (solve(button,line));
	    n--;
	}
    }

    public static String solve(String[][] button, String line){
	String mozi = "";

	for(int i=0; i<line.length(); i++){
	    int buttonNum = Integer.parseInt(line.substring(i,i+1));
	    String letter = Integer.toString(buttonNum);
	    int renzoku = 0;

	    for(;;){
		if(buttonNum == 0){break;}
		else if(letter.equals(line.substring(i+1,i+2))){
		    renzoku++; i++;
		}
		else{
		    renzoku = renzoku%button[buttonNum].length;
		    mozi += button[buttonNum][renzoku];
		    break;
		}
	    }
	}
	return mozi;
    }
}
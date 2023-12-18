import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String n = scan.next();

	String ans = "";
	for(int i = 0; i < 3; i++){	    
	    if(n.charAt(i) == '9'){
		ans += "1";
	    }else{
		ans += "9";
	    }
	}

	System.out.println(ans);
    }
}

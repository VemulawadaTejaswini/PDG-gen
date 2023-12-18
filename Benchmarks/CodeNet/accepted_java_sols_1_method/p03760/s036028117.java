import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String o = scan.next();
	String e = scan.next();

	String ans = "";
	for(int i = 0; i < e.length()*2; i++){
	    if(i % 2 == 0){
		ans += o.charAt(i/2);
	    }else{
		ans += e.charAt(i/2);
	    }
	}

	if(o.length() > e.length()){
	    ans += o.charAt(o.length()-1);
	}

	System.out.println(ans);
    }
}

	

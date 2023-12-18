import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String a = scan.next();
	String b = scan.next();

	if(a.length() > b.length()){
	    System.out.println("GREATER");
	}else if(b.length() > a.length()){
	    System.out.println("LESS");
	}else{
	    int flag = -1;
	    for(int i = 0; i < a.length(); i++){
		if(a.charAt(i) > b.charAt(i)){
		    System.out.println("GREATER");
		    flag = 1;
		    break;
		}else if(b.charAt(i) > a.charAt(i)){
		    System.out.println("LESS");
		    flag = 1;
		    break;
		}
	    }
	    if(flag == -1){
		System.out.println("EQUAL");
	    }
	}
    }
}

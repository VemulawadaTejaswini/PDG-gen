import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();
	String t = scan.next();

	int flag = -1;
	for(int i = 0; i < s.length(); i++){
	    if(s.equals(t)){
		flag = 1;
		break;
	    }
	    char c = s.charAt(s.length()-1);
	    String C = String.valueOf(c);
	    s = s.substring(0, s.length()-1);
	    s = C+s;
	}

	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}

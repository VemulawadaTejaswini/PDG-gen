import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String str;
	long num;
	int sum=0;
	char c;

	while(true){
	    str = in.next();
	    if(str.equals("0"))break;
	    sum=0;
	    for(int i=0;i<str.length();i++){
		c = str.charAt(i);
		sum+=Character.getNumericValue(c);
	    }
	    System.out.println(sum);
	}
    }
}


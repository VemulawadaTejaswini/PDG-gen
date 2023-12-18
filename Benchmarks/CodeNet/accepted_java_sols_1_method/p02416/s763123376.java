import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
	Character objChar1;
	String str;
	char c;
	int i,num,sum;
	Scanner scan = new Scanner(System.in);
	while(true) {
	str=scan.next();
	if(str.equals("0"))
		break;
	sum=0;

	for (i=0;i<str.length();i++){
		c=str.charAt(i);
		num=Character.digit(c,10);
		sum+=num;
	}
	System.out.println(sum);
	}
}
}
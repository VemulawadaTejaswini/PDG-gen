import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String str;
	int num,sum=0;

	while(true){
	    str = in.next();
	    if(str.equals("0"))break;
	    num = Integer.parseInt(str);
	    sum=0;
	    for(int i=0;i<str.length();i++){  
		sum+=num%10;
		num /=10;
	    }
	    System.out.println(sum);
      	}
    }
}
	   


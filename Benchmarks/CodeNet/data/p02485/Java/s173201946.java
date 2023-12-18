import java.util.Scanner;

public class Main{
    public static void main (String[] args){
	Scanner sc = new Scanner (System.in);
	int i;
	int sum=0;
	while(true){
	    String str = sc.next();
	    if(str.charAt(0)==0) break;
	    for(i=0;i<str.length();i++){
		sum+=Integer.parseInt("str.charAt(i)");
	    }
	    System.out.println("+sum");
	}
    }
}
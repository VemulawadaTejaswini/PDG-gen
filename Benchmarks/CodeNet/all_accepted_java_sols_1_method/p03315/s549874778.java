import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	int count = 0;
	for(int i=0;i<4;i++){
	    if(S.charAt(i) == '+') count++;
	    else count--;
	}
	System.out.print(count);
    }
}

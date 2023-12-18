import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	String s = scan.next();
	int k = scan.nextInt();

	char c = s.charAt(k-1);
	for(int i = 0; i < s.length(); i++){
	    if(s.charAt(i) != c){
		System.out.print('*');
	    }else{
		System.out.print(c);
	    }
	}
	System.out.println();
    }
}

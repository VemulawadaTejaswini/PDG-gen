import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n, h, l, c;
	String s="a";
	while(true){
	    String line = sc.next();
	    if(line.equals("-")) break;
	    n = sc.nextInt();
	    for(int i=0;i<n;i++){
		h = sc.nextInt();
		line = line.substring(h)+line.substring(0,h);
	    }
	    System.out.println(line);
	}
    }
}
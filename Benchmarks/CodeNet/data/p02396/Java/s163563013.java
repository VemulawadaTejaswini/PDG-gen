import java.util.Scanner;

class Main{
    public static void main(String[] args){
	int s[];
	s = new int[10000];
	int i = 0;
	int n = 0;

	while(true){
	    Scanner scan = new Scanner(System.in);
	    String st = scan.next();
	    if (Integer.parseInt(st) == 0){
		break;
	    }
	    s[i] = Integer.parseInt(st);
		i++;
	}
	    for( n = 0; n < i; n++){
		System.out.println("Case " + (n+1) + ": " + s[n]);
	    }
    }
}


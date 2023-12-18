import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int n,p,d1,d2,maxp,maxv;
	while(stdIn.hasNextInt()){
	    n = stdIn.nextInt();
	    if(n == 0) break;
	    maxp = maxv = 0;
	    for(int i = 0;i < n;i++){
		p = stdIn.nextInt();
		d1 = stdIn.nextInt();
		d2 = stdIn.nextInt();
		if(maxv < d1+d2){
		    maxp = p;
		    maxv = d1 + d2;
		}
	    }
	    System.out.printf(maxp,maxv);
	}
    }
}
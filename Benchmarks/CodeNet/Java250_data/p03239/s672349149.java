import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int T = sc.nextInt();
	int c=0;
	int t=0;
	int minC=1000;
	boolean cre = false;
	for(int i=0;i<N;i++){
	    c=sc.nextInt();
	    t=sc.nextInt();
	    if(t <= T){
		if(c<minC)
		    minC=c;
		cre=true;
	    }
	}
	if(cre)System.out.print(minC);
	else System.out.print("TLE");
    }
}

import java.util.Scanner;

public class Main {

	private static final int X = 600;

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        int S,d;
        while(sc.hasNext()){
            S = 0;
        	d = sc.nextInt();
        	for(int i=1,j=d;j<X;j+=d,i++){
        		S += Math.pow(d*i,2)*d;
        	}

        	//output
        	System.out.println(S);
        }
    }
}
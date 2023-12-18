import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    while(true){
		int in = s.nextInt(); // num of input
		if(in==0)break;
		int data[][] = new int[in][3];
		long out[] = new long[4001];

		for(int i=0 ; i<in ; i++) { // input
		    for(int j=0 ; j<3 ; j++)
			data[i][j] = s.nextInt();
		}

		boolean flag = true; // none found
		for(int i=0 ; i<in ; i++)
		    out[data[i][0]] += (long) data[i][1]*data[i][2];
		for(int i=0 ; i<4001 ; i++) {
		    if(out[i]>=(long)1000000) {
			System.out.println(i);
			flag = false;
		    }
		}
		if(flag)
		    System.out.println("NA");
	    }
      	}
}
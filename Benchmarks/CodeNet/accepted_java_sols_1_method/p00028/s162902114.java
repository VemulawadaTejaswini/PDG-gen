import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int ns[] = new int[101];
		while(in.hasNext()) ns[in.nextInt()]++;
		int best=0;
		for(int e: ns)if(e>best)best=e;
		for(int i=1; i<=100; i++)if(ns[i]==best)System.out.println(i);
	}

}
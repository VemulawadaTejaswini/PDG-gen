import java.util.*;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    while(true){
		int in = s.nextInt(); // num of input
		if(in==0)break;
		int data[][] = new int[in][3];
		long out[] = new long[4001];
		LinkedList <Integer> o = new LinkedList <Integer> ();

		for(int i=0 ; i<in ; i++) { // input
		    for(int j=0 ; j<3 ; j++)
			data[i][j] = s.nextInt();
		}

		for(int i=0 ; i<in ; i++) {
		    out[data[i][0]] += (long) data[i][1]*data[i][2];
		    if(o.indexOf(data[i][0]) == -1)
			o.addLast(data[i][0]);
		}
		boolean flag = true; // none found

		while(o.size()!=0) {
		    int tmp = o.remove(0);
		    if(out[tmp]>=(long)1000000) {
			System.out.println(tmp);
			flag = false;
		    }
		}

		if(flag)
		    System.out.println("NA");
	    }
      	}
}
import java.util.Scanner;

class Main{
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
	    int n = stdIn.nextInt();
	    int m = stdIn.nextInt();
	    int[] l = new int[m];
	    int[] r = new int[m];
	    for(int i = 0;i < m;i++) {
	    	l[i] = stdIn.nextInt();
	    	r[i] = stdIn.nextInt();
	    }
	    int max = l[0];
	    int min = r[0];
	    for(int i = 1;i < m;i++) {
	    	if(min > r[i])
	    		min = r[i];
	    	if(max < l[i])
	    		max = l[i];
	    }
	    int k = min - max + 1;
	    if(k<0)
	    	System.out.println(0);
	    else
	    	System.out.println(k);
	}
}
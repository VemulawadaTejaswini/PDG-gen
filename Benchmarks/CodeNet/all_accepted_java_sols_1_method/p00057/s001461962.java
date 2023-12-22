import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] d = new int[10001];
	d[0]=1;
	d[1]=2;
	for(int i=2 ; i<10001 ; i++)
	    d[i] = d[i-1]+i;
	while(s.hasNext())
	    System.out.println(d[s.nextInt()]);
    }
}
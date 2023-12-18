import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    if(!(a==0 && b==0)) solve(a, b);
	}
    }

    static void solve(int a, int b){
	String[] n = {"A", "B", "C", "D", "E"};
	long[] m = new long[5];
	m[0] = a+b;
	int i;
	int max = 0;
	for(i=1; i<n.length; i++){
	    a = kbd.nextInt();
	    b = kbd.nextInt();
	    m[i] = a+b;
	    if(m[i] > m[max])  max = i;
	}
	System.out.println(n[max]+" "+m[max]);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//while (true) {
	int N =sc.nextInt();
	int L =sc.nextInt();

	int small;
	if(L > 0) {
	    small = L;
	} else {
	    small = L+N-1;
	}
	
	int taste = 0;

	for(int i = 1; i <= N; i++) {
	    int k = L+i-1;
	    //System.out.println(k);
	    if(k == 0) small = 0;
	    taste += k;
	}

	    System.out.println(taste - small);

    }
}

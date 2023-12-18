import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] p = new int[3000];
	p[0]=2;
	int num = 0;
	int tmp = 3;
	while(p[num] < 25000) {
	    boolean flag = true;
	    for(int i=0 ; p[i]*p[i]<tmp ; i++) {
		if (tmp % p[i] == 0) {
		    flag = false;
		    break;
		}
	    }
	    if (flag) {
		num++;
		p[num]=tmp;
	    }
	    tmp++;
	}
	while(s.hasNext()) {
	    int n = s.nextInt();
	    if (n==0) break;
	    int c=0;
	    int i=0;
	    while (p[i] < n/2+1) {
		boolean f = false;
		for(int j=0 ; j<num ; j++) {
		    if (p[j] == (n-p[i])) {
			f = true;
			break;
		    }
		}
		if(f)
		    c++;
		i++;
	    }
	    System.out.println(c);
	}
    }
}
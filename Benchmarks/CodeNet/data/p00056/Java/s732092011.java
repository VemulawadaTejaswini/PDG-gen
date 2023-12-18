import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	LinkedList<Integer> p = new LinkedList<Integer>();
	p.addLast(2);
	int tmp = 3;
	while(p.getLast() < 25000) {
	    boolean flag = true;
	    for(int i=0 ; i<p.size()-1 ; i++) {
		if (tmp % p.get(i) == 0) {
		    flag = false;
		    break;
		}
	    }
	    if (flag)
		p.addLast(tmp);
	    tmp++;
	}
	while(s.hasNext()) {
	    int n = s.nextInt();
	    if (n==0) break;
	    int c=0;
	    int i=0;
	    while (p.get(i) < n/2+1) {
		if (p.indexOf(n-p.get(i)) != -1)
		    c++;
		i++;
	    }
	    System.out.println(c);
	}
    }
}
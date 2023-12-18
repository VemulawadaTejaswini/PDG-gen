import java.util.*;

public class Main {
    static final long dayInMillis = 1000L*60L*60L*24L;
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true) {
	    int d[][] = new int[2][3];
	    boolean flag = false;
	    for(int i = 0; i < 2; ++i) {
		for(int j = 0; j < 3; ++j) {
		    d[i][j] = s.nextInt();
		    if(d[i][j] != -1) flag = true;
		}
	    }
	    if(!flag) break;
	    GregorianCalendar a, b;
	    a = new GregorianCalendar(d[0][0],d[0][1],d[0][2]);
	    a.setGregorianChange(new Date(Long.MIN_VALUE));
	    b = new GregorianCalendar(d[1][0],d[1][1],d[1][2]);
	    b.setGregorianChange(new Date(Long.MIN_VALUE));
	    System.out.println(Math.abs(b.getTimeInMillis()-a.getTimeInMillis())/dayInMillis);
	}
    }
}
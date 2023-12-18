import java.util.*;

public class Main {
    static final int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isUruu(int y) {
	return y%4 == 0 && (y%100 != 0 || y%400 == 0);
    }

    public static int getDays(int y,int m,int d) {
	int res = 0;
	for(int i = 1; i < y-1; ++i) {
	    if(isUruu(i)) res += 366;
	    else     res += 365;
	}
	for(int i = 1; i <= m-1; ++i) {
	    res += days[i];
	    if(i == 2 && isUruu(y)) ++res;
	}
	res += d;
	return res;
    }

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
	    System.out.println(Math.abs(getDays(d[1][0],d[1][1],d[1][2])-getDays(d[0][0],d[0][1],d[0][2])));
	}
    }
}
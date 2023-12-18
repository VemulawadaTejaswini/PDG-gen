import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int ans = 0;
	if(Math.abs(x)==Math.abs(y)) {
	    ans = 1;
    }else if(Math.abs(x)<Math.abs(y)) {
	    ans = Math.abs(y)-Math.abs(x) + (y<0?1:0) + (x<0?1:0);
	}else {
	    ans= Math.abs(x)- Math.abs(y) + (y>0?1:0) + (x>0?1:0);
	}
	
	System.out.println(ans);

    }
}
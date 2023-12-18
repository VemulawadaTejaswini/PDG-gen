import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
	    int[] dat = new int[3];
	    for(int i = 0; i < 3; ++i) {
		dat[i] = -1;
	    }
	    for(int tc = 0; tc < 10; ++tc) {
		int h = s.nextInt();
		int i, p = -1;
		for(i = 0; i < 3; ++i) {
		    if(dat[i] < h) {
			p = i;
			break;
		    }
		}
		if(p != -1) {
		    for(; i+1 < 3; ++i) {
			dat[i+1] = dat[i];
		    }
		    dat[p] = h;
		}
	    }
	    for(int i = 0; i < 3; ++i) {
		System.out.println(dat[i]);
	    }
	}
    }
}
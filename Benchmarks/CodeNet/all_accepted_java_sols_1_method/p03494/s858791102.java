import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int a = 0;
	int min = Integer.MAX_VALUE;
	for(int i = 0; i<N; i++) {
	    a = Integer.parseInt(sc.next());
	    int cnt = 0;
	    while(a % 2 == 0) {
		if(cnt>=min) break;
		cnt++;
		a /= 2;
	    }
	    min = Math.min(min,cnt);
	}
	System.out.println(min);



    }
}
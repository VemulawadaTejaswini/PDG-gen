import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int cnt = 0;

	for(int i = 1; i<=n; i++) {
	    if(i%2==0) continue;
	    int locnt = 0;
	    for(int j = 1; j<=i;j++) {
		if(i%j==0) locnt++;
	    }
	    if(locnt==8) cnt++;
	}

	System.out.println(cnt);

    }
}
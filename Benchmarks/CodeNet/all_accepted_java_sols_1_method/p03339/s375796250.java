import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String S = sc.next();
	char[] c = S.toCharArray();
	int[] score = new int[N];

	for(int i = 1; i<S.length(); i++) {
	    if(c[i] == 'E') {
		score[0]++;
	    }
	}

	int current = 1;
	int pre = 0;
	while(current < N) {
	    score[current] = score[pre];
	    if(c[current] == 'E') {
		score[current]--;
	    }
	    if(c[pre] == 'W') {
		score[current]++;
	    }
	    current++;
	    pre++;
	}

	int min = Integer.MAX_VALUE;
	for(int s : score) {
	    min = Math.min(s,min);
	}
	System.out.println(min);
    }
}
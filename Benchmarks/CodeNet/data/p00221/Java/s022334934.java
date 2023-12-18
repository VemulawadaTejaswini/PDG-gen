import java.util.*;
class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    boolean[] players;
    int m,n;
    String[] expected;

    void run(){
	makeExpected();
	while(true){
	    m = sc.nextInt();
	    n = sc.nextInt();
	    if(m==0 && n==0) break;

	    players = new boolean[m+1];
	    Arrays.fill(players, true);
	    players[0] = false;

	    int p = 1;
	    for(int i=1; i<=n; i++){
		String s = sc.next();
		if(!s.equals(expected[i])){
		    players[p] = false;
		    m--;
		    if(m==1) break;
		}
		do{
		    p = p+1==players.length ? 1:p+1;
		}while(!players[p]);
	    }

	    for(int i=0; i<players.length; i++)
		if(players[i]) System.out.print(i+" ");
	    System.out.println();
	}
    }

    void makeExpected(){
	expected = new String[10001];
	for(int i=1; i<expected.length; i++)
	    if(i%15==0) expected[i] = "FizzBuzz";
	    else if(i%3==0) expected[i] = "Fizz";
	    else if(i%5==0) expected[i] = "Buzz";
	    else expected[i] = Integer.toString(i);
    }
}
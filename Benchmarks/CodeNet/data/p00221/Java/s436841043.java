import java.util.*;
class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> players;
    int m,n;
    String[] expected;

    void run(){
	makeExpected();
	while(true){
	    m = sc.nextInt();
	    n = sc.nextInt();
	    if(m==0 && n==0) break;

	    players = new ArrayList<Integer>();
	    for(int i=1; i<=m; i++)
		players.add(i);

	    int p = 0;
	    for(int i=1; i<=n; i++){
		String s = sc.next();
		if(!s.equals(expected[i])){
		    players.remove(p);
		    if(p==players.size()) p=0;
		    if(players.size()==1) break;
		}
		else p = (p+1)%players.size();
	    }

	    for(int i=0; i<players.size(); i++)
		System.out.print(players.get(i)+" ");
	    System.out.println();
	}
    }

    void makeExpected(){
	expected = new String[10100];
	for(int i=1; i<expected.length; i++)
	    if(i%15==0) expected[i] = "FizzBuzz";
	    else if(i%3==0) expected[i] = "Fizz";
	    else if(i%5==0) expected[i] = "Buzz";
	    else expected[i] = Integer.toString(i);
    }
}
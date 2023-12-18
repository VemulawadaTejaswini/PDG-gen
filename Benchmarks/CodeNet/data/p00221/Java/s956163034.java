import java.util.*;
class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    boolean debug = false;

    ArrayList<Integer> players;
    int m,n;
    String[] expected;
    String[] s;

    void run(){
	makeExpected();
	while(true){
	    m = sc.nextInt();
	    n = sc.nextInt();
	    if(m==0 && n==0) break;

	    players = new ArrayList<Integer>();
	    for(int i=1; i<=m; i++)
		players.add(i);

	    s = new String[n+1];
	    for(int i=1; i<=n; i++)
		s[i] = sc.next();

	    int p = 0;
	    for(int i=1; i<=n; i++){
		if(!s[i].equals(expected[i])){
		    players.remove(p);
		    if(p==players.size()) p=0;
		    if(players.size()==1) break;
		}
		else p = (p+1)%players.size();
		if(debug) System.out.println("*  "+players+"  *");
	    }

	    for(int i=0; i<players.size(); i++)
		System.out.print(players.get(i)+" ");
	    System.out.println();
	}
    }

    void makeExpected(){
	expected = new String[10100];
	for(int i=1; i<expected.length; i++)
	    if(i==3)
		for(int k=i; k<expected.length; k+=3)
		    expected[k] = "Fizz";
	    else if(i==5)
		for(int k=i; k<expected.length; k+=5)
		    expected[k] = "Buzz";
	    else if(i==15)
		for(int k=i; k<expected.length; k+=15)
		    expected[i] = "FizzBuzz";
	    else if(expected[i]==null)
		expected[i] = Integer.toString(i);
    }
}
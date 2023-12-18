import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int h, w;
    int[][] s;
    int[] ans;
    int next;
    HashMap<Integer, Integer>  Answers;
    int max = Integer.MAX_VALUE;

    void run(){
	while(sc.hasNext()){
	    h = sc.nextInt();
	    if(h!=0){
		put();	
		solve();
		System.out.println();
	    }
	}
    }

    void put(){
	w = sc.nextInt();
	s = new int[h+2][w+2];
	for(int i=1; i<(h+2); i++){
	    for(int k=1; k<(w+2); k++){
		String t = sc.next();
		if(t.equals("?")){
		    s[i][k] = max;
		    s[i][0]++; s[0][k]++;
		    s[0][0]++;
		}
		else s[i][k] = Integer.parseInt(t);
	    }
	    //System.out.println();
	}
	ans = new int[s[0][0]];
	next = 0;
	Answers = new HashMap<Integer, Integer>();
    }

    void solve(){
	boolean con = true;
	boolean did = false;
	while(con && s[0][0]>0){
	    for(int i=1; i<s.length; i++)
		for(int k=1; k<s[i].length; k++)
		    if(s[i][k]==max)
			if(s[0][k]==1){ calc(i, k, "i"); did = true; }
			else if(s[i][0]==1){ calc(i, k, "k"); did = true; }
	    if(!did) con = false;
	}
	Arrays.sort(ans);
	if(con)
	    for(int i=0; i<ans.length; i++)
		System.out.println(Answers.get(ans[i]));
	else
	    System.out.println("NO");
    }

    void calc(int h, int w, String t){
	int a = 0;
	if(t.equals("i")){
	    for(int i=1; i<s.length; i++){
		if(i==s.length-1) a += s[i][w];
		else if(i!=h) a -= s[i][w];
	    }
	}
	else {
	    for(int k=1; k<s[h].length; k++){
		if(k==s[h].length-1) a += s[h][k];
		else if(k!=w) a -= s[h][k];
	    }
	}
	ans[next++] = (h-1)*s[h].length+w;
	Answers.put((h-1)*s[h].length+w, a);
	s[h][w] = a;
	s[0][w]--; s[h][0]--; s[0][0]--;
	//System.out.println("*"+h+" "+w+" "+a);
    }
}


			    
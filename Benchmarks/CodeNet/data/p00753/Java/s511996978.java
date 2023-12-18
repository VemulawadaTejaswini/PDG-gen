import java.util.*;
public class Main {
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    ArrayList<Data> data;
    boolean debug = false;
    

    boolean[] p; 
    void set_prime(){
	p = new boolean[123457*2];
	for(int i=2; i<123457*2; i++)
	    for(int j=2; j*i<=123456*2; j++) p[j*i] = true;
    }

    void run() {
	set_prime();
	input();
	for(int i=0; i<data.size();i++){
	    if(debug){
		System.out.println("-----------");
		data.get(i).print_n();
	    }
	    solve(i);
	    data.get(i).print_ans();
	}
    }
    
    void solve(int i){
	int n = data.get(i).get_n();
	int ans = 0;
	for(int j=n+1; j<=n*2; j++)
	    if(!p[j]) ans++;
	data.get(i).set_ans(String.valueOf(ans));
    }
    
    void input(){
	data = new ArrayList<Data>();
	while(true){
	    int n=sc.nextInt();
	    if(n==0) break;
	    data.add(new Data(n));
	}
    }

}

class Data{
    int n;
    String ans;

    Data(int n) {
	this.n=n;
    }

    int get_n(){return n;}

    void set_ans(String a){ans = a;}
    void print_n(){System.out.println("n= "+n);}
    void print_ans(){System.out.println(ans);}
}
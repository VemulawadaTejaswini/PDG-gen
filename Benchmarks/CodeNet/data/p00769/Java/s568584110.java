import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    ArrayList<Data> data;
    boolean debug = false;
    
    //global hensuu except for templete
    char[] lines;

    //method except for templete
    int rec(int left, int right){
	PriorityQueue<Integer> votes = new PriorityQueue<Integer>(10, new Comparator<Integer>(){
		public int compare(Integer a, Integer b){
		    return (int)(a - b);
		}
	    });

	int l = left, r = left;
	if(lines[l]-'0' >=0 && lines[l]-'0'<=9) return getNumber(left, right);

	int num = 0;
	for(int i=left; i<=right; i++){
	    r = i;
	    if(lines[i]==']') num--;
	    if(lines[i]=='[') num++;
	    if(num==0){
		votes.add(rec(l+1, r-1));
		l = i+1;
		num = 0;
	    }
	}

	int res = 0;
	int size = votes.size()/2 + 1;
	for(int i=0; i<size; i++) res += votes.poll();
	return res;
    }

    int getNumber(int left, int right){
	int res = 0;
	int ten = 1;
	for(int i=right; i>=left; i--){
	    res += (lines[i] - '0') * ten;
	    ten *= 10;
	}
	return res/2+1;
    }


    void run() {
	input();
	for(int i=0;i<data.size();i++){
	    if(debug){
		System.out.println("--------");
		data.get(i).print_line();
	    }
	    solve(i);
	    data.get(i).print_ans();
	}
    }
    
    void solve(int dataset){
	String ans = "";
	Data d = data.get(dataset);
	String line = d.line;
	lines = line.toCharArray();

	ans = Integer.toString(rec(0, lines.length-1));

	data.get(dataset).set_ans(ans);
    }

    void input(){
	data = new ArrayList<Data>();
	int n = sc.nextInt();
	for(int i=0; i<n; i++){
	    String s = sc.next();
	    data.add(new Data(s));
	}
    }
}

class Data{
    String line;
    String ans;

    Data(String line){
	this.line = line;
    }
    
    void set_ans(String a){ans=a;}
    void print_line(){System.out.println("line = "+line);}
    void print_ans(){System.out.println(ans);}
}
    
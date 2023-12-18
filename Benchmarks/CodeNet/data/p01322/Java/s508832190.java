import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    Lot[] lot;
    int n, m, ans;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    if(!(n==0 && m==0)){
		lot = new Lot[n];
		for(int i=0; i<n; i++)
		    lot[i] = new Lot(sc.next(), sc.nextInt());
		ans = 0;
		solve();
	    }
	}
    }

    void solve(){
	for(int i=0; i<m; i++){
	    char[] x = sc.next().toCharArray();
	    for(int j=0; j<n; j++){
		char[] y = lot[j].getNum();
		if(check(x, y, 0)){
		    ans += lot[j].getMoney();
		    j = n;
		}
	    }
	}
	System.out.println(ans);
    }

    boolean check(char[] x, char[] y, int level){
	if(level==x.length)
	    return true;
	if(x[level]==y[level] || y[level]=='*')
	    return check(x, y, level+1);
	else return false;
    }

    class Lot{
	char[] num;
	int money;
	Lot(String s, int m){
	    num = s.toCharArray();
	    money = m;
	}
	char[] getNum(){ return num; }
	int getMoney(){ return money; }
    }
}
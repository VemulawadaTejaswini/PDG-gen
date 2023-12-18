import java.util.*;

class Main{
    static int count;
    static int n,s;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();
	s = sc.nextInt();

	while(n!=0){
	    count = 0;

	    solve(0,0,0);

	    System.out.println(count);

	    n = sc.nextInt();
	    s = sc.nextInt();
	}
    }

    public static void solve(int pos, int sum, int num){
	//System.out.println(pos+" "+sum+" "+num);
	if(num>n){return;}
	if(num==n && sum==s){count++; return;}

	for(int i=pos; i<10; i++){
	    solve(i+1, sum+i, num+1);
	}
    }
}
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
 
	while(kbd.hasNext()) {
	    int n = kbd.nextInt();
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    int c = kbd.nextInt();
	    int x = kbd.nextInt();
	    if(!(n==0 && a==0 && b==0 && c==0 && x==0)){
		solve(n, a, b, c, x);
	    }
	}
    }
 
    static void solve(int n, int a, int b, int c, int x){
	int f=0;//かかったフレーム数
	int[] r = new int[n];  //リール乱数の配列
	int i;   //作業用
	for(i=0; i<n; i++){      //乱数放り込む
	    r[i] = kbd.nextInt();
	}
 
	i=0;
	while(f<=10000 && i<n){
	    if(r[i]==x){
		i++;
	    }
	    x = (a*x+b)%c;
	    f++;
	}
	
	if(i==n){
	    System.out.println(f-1);
	}
	else{
	    System.out.println("-1");
	}
    }
}
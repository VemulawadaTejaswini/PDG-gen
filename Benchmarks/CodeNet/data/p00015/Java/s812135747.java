import java.util.*;
public class Main{
    public static void main(String[]args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    boolean debug = false;
    
    int k;
    String n;
    String m;
    int[] num;
    boolean carry;

    void run(){
	while(sc.hasNext()){
	    k = sc.nextInt();
	    while(k>0){
		n = sc.next();
		m = sc.next();
		num = new int[1000];
		carry = false;
		if(n.length()>80 || m.length()>80) {
		    System.out.println("overflow");
		}
		else solve();
		k--;
	    }
	}
    }

    void solve(){
	int i; // 数字の桁位置
	int j; // 配列の桁位置
	j = num.length-1;
	for(i=n.length()-1; i>=0; i--){
	    num[j] = Integer.parseInt(n.substring(i, i+1));
	    j--;
	}
	if(debug) print();
	j = num.length-1;
	for(i=m.length()-1; i>=0; i--){
	    if(carry){
		num[j]++;
		carry = false;
	    }
	    num[j] += Integer.parseInt(m.substring(i, i+1));
	    if(num[j] >=10){
		carry = true;
		num[j] -= 10;
	    }
	    j--;
	}
	while(carry){
	    num[j]++;
	    if(num[j]>=10)
		num[j] -= 10;
	    else carry = false;
	    j--;
	}
	if(debug) print();
	
	j=0;
	while(num[j]==0)j++;
	if(num.length-j<=80){  
	    for(; j<num.length; j++)
		System.out.print(num[j]);
	    System.out.println();
	}
	else System.out.println("overflow");
    }

    void print(){
	for(int i=900; i<num.length; i++)
	    System.out.print(num[i]);
	System.out.println();
    }
}
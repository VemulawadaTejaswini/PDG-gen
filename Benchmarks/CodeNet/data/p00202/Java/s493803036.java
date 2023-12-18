/*
  0202 何人で行っても奢らせる
  どんな人数でも奢ってもらえる = 合計が素数のとき

  簡易ザックで合計以下の時の最大を出して、上から順に素数判定
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, max;
    boolean[] knap;
    boolean[] prime;
    int[] price;

    void run(){
	prime = new boolean[1000001];
	setP();
	while(sc.hasNext()){
	    n = sc.nextInt();
	    max = sc.nextInt();
	    if(n==0 && max==0) break;


	    price = new int[n];
	    for(int i=0; i<n; i++)
		price[i] = sc.nextInt();

	    knap = new boolean[max+1];
	    knap[0] = true;


	    // ナップザックすたーと
	    for(int i=0; i<n; i++){
		for(int k=price[i]; k<knap.length; k++)
		    if(knap[k-price[i]]){
			knap[k] = true;
		    }
	    }
    
	    int x = knap.length-1;
	    while(x>0 && !(prime[x] && knap[x])) x--; 

	    System.out.println(x>0 ? x:"NA");
	}
    }

    void setP(){
	Arrays.fill(prime, true);
	prime[0] = prime[1] = false;
	for(int i=2; i<prime.length; i++)
	    if(prime[i])
		for(int k=i+i; k<prime.length; k+=i)
		    prime[k] = false;
    }
}
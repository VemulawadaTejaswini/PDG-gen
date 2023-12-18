import java.util.*;

class Main{

    static int[] kouka = {10,50,100,500};

    public static void main(String[] args){
	Scanner sc = new Scanner (System.in);

	int money = sc.nextInt();

	boolean boo = false;
	while(money!=0){
	    if(boo)System.out.println();
	    boo = true;
	    int[] coin = new int[4];
	    for(int i=0; i<coin.length; i++){
		coin[i] = sc.nextInt();
	    }

	    String ans = solve(coin,money);
	    System.out.print(ans);

	    money = sc.nextInt();
	}
    }
    
    public static String solve(int[] coin, int money){
	int sum = 0;
	for(int i=0; i<coin.length; i++){
	    sum += kouka[i] * coin[i];
	}
	int[] oturiKouka = getOturi(sum,money);
	String ans = "";
	for(int i=0; i<coin.length; i++){
	    if(coin[i]-oturiKouka[i]>0)ans += kouka[i] + " " + (coin[i]-oturiKouka[i]) + "\n";
	}
	return ans;
    }

    public static int[] getOturi(int shiharai,int money){
	int oturi = shiharai - money;
	int[] oturiKouka = new int[4];
	while(oturi!=0){
	    for(int i=kouka.length-1; i>=0;){
		if(oturi-kouka[i]>=0){
		    oturi = oturi - kouka[i];
		    oturiKouka[i]++;
		}else i--;
	    }
	}
	return oturiKouka;
    }
}
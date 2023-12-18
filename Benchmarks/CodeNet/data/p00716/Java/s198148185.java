import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int m = sc.nextInt();//f[^ZbgÌ

	while(m!=0){

	    int money = sc.nextInt();//^pà
	    int year = sc.nextInt();//N
	    int type = sc.nextInt();//^pû@ÌíÞ

	    int finalAns = 0;//ÅåÌÅIà

	    while(type!=0){
		int tanri = sc.nextInt();//Por¡
		double rate = sc.nextDouble();//N¦
		int tesu = sc.nextInt();//NÌè¿
		int ans = solve(money,year,tanri,rate,tesu);//^pû@²ÆÌÅIà
		if(ans>finalAns) finalAns = ans;
		type--;
	    }
	    System.out.println(finalAns);
	    m--;
	}
    }

    public static int solve(int money, int year, int tanri, double rate, int tesu){
	int zandaka = 0;//c
	int ratesum = 0;//qÝv
	if(tanri==1){//¡Ìê
	    while(year!=0){
		zandaka = money + (int)(money*rate) - tesu;
		money = zandaka;
		year--;
	    }
	}else if(tanri==0){//PÌê
	    while(year!=0){
		zandaka = money - tesu;
		ratesum += (int)(money*rate);
		money = zandaka;
		year--;	    
	    }
	}
	
	return zandaka + ratesum;
    }
}
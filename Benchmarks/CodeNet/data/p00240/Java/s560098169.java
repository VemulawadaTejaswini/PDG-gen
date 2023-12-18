import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, y, b;
    int ansB;
    double max;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    y = sc.nextInt();
	    ansB = -1; max = 0;

	    for(int i=0; i<n; i++){
		b = sc.nextInt();
		double money = getMoney(sc.nextDouble(), sc.nextInt());
		if(money > max){
		    max = money;
		    ansB = b;
		}
		//System.out.println(money);
	    }

	    System.out.println(ansB);
	}
    }

    double getMoney(double r, int t){
	if(t==1)
	    return 1+y*r/100;
	else
	    return getP(1+r/100, y);
    }

    double getP(double a, int x){
	if(x==1)
	    return a;
	double z = getP(a, x/2);
	if(x%2==0)	    
	    return z*z;
	else 
	    return z*z*getP(a, 1);
    }
}
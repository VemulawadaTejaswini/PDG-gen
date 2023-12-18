import java.util.*;

class Main{
    static int p,q,a;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	p = sc.nextInt();
	q = sc.nextInt();
	a = sc.nextInt();
	int n = sc.nextInt();

	while(p!=0 && q!=0 && a!=0 && n!=0){
	    
	    System.out.println(solve(n,1,1,0));
	    
	    p = sc.nextInt();
	    q = sc.nextInt();
	    a = sc.nextInt();
	    n = sc.nextInt();
	    
	}
	
    }

    //n:cèÌXebv d:»ÝÌóµ prod:Ï sum:»±ÜÅÌv
    public static int solve(int n, int d, int prod, int sum){
	int count = 0;
	for(int i=d; prod*i<=a; i++){
	    int left = p * (prod * i);//¶Ó
	    int right = sum * i + prod;//EÓ
	    if(left < right * q){continue;}//EÓª¶Óæèå«¯êÎ
	    if(left == right *q){count++; continue;}//EÓÆ¶Óªêvµ½ç
	    if(n ==1){continue;}//TõIíè
	    count += solve(n-1,i,prod*i,right);
	}
	return count;
    }
}
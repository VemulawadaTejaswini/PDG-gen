import java.util.*;

class Main{
    static int n;//nÔÚÌf
    static int[] p;
    static int MAX = 1000000;
    static int count;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//GgXelXÌâ¿
	//zñð1000000pÓµÄAYªfÈç1A»êÈOÍ0ði[
	p = new int[MAX];
	for(int i=2; i<p.length; i++)p[i] = 1;
	for(int i=2; i<Math.sqrt(MAX)+1; i++){
	    for(int j=i*2; j<MAX; j+=i){
		p[j] = 0;
	    }
	}

	int a = sc.nextInt();//
	int d = sc.nextInt();//ö·
	n = sc.nextInt();

	while(a!=0 && d!=0 && n!=0){
	    count=0;

	    System.out.println(solve(a,d));

	    a = sc.nextInt();
	    d = sc.nextInt();
	    n = sc.nextInt();
	}
    }

    public static int solve(int a, int d){
	for(;;){
	    if(p[a]==1)count++;//aªfÈç   
	    if(count==n)break;//nÔÚÌfªÜÁ½ç
	    a += d;
	}
	return a;
    }
}
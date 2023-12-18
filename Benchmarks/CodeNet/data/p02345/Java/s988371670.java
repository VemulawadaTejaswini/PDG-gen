import java.util.Scanner;

public class Main {
	int[] a;
	int n=1;
	public static void main(String[] args){
		Main test = new Main();
		Scanner inputScanner = new Scanner(System.in).useDelimiter("\\s");
		int n1 = inputScanner.nextInt();
		int q = inputScanner.nextInt();
		
		
		while (test.n < n1){
			test.n *= 2;
		}
	//	System.out.println(Integer.toString(test.n));
		test.a = new int[(2 * test.n)-1 ]; 
	//	System.out.println(test.a.length);
		for(int i=0;i<test.a.length;i++){
			test.a[i]=Integer.MAX_VALUE;
		}
		
		
		
		
		int cmd=-1;
		int arg1;
		int arg2;
		for(int j =0;j<q;j++){
			cmd = inputScanner.nextInt();
			arg1=inputScanner.nextInt();
			arg2=inputScanner.nextInt();
			
			if(cmd ==0)
				test.update(arg1, arg2);
			else if(cmd ==1)
				System.out.println(test.findMin(arg1, arg2));
		}
	}
	
	public void update(int k, int b){
		k += (n-1);
		a[k] = b;
		while(k > 0){
			k = (k-1)/2;
			a[k] = Integer.min(a[(k*2)+1], a[(k*2)+2]);
		}
	}
	
	public int findMin(int b, int c){
		
		return query(b,c+1,0,0,n);
	}
	
	public int query(int b, int c, int k, int l, int r){
		if (r <= b || c <= l)
			return Integer.MAX_VALUE;
		if((b<=l && r<=c))
			return a[k];
		
		int o1 = query(b,c,(k*2)+1,l,(l+r)/2);
		int o2 = query(b,c,(k*2)+2,(l+r)/2,r);
		return Integer.min(o1, o2);	
	}
}


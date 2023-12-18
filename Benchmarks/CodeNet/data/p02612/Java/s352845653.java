class Main{
	
public static void main (String[] args) {
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	int N = sc.nextInt();
	boolean flag = true;
	
	while (flag) {
		N-=1000;
		if (N<=0) {
			flag=false;
			N*=-1;
		}
	}
	
	System.out.println(N);
	
	sc.close();;
	
}
	
	
}


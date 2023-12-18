class Main{
    public static void main(String[] a){
        if(a.length > 30)
			System.out.println("Data set is more than 30.");
		else {
		for(int i=0;i<a.length;i++) {
			int no = Integer.parseInt(a[i]);
			printPrimes(no);
		}
    }

    public static boolean isPrime(int no) {
		// TODO Auto-generated method stub
		int m = no/2;
		boolean p = true;
		for(int i=2;i<=m;i++) {
			if(no%i==0)
				p = false;
		}
		return p;
	}

    public static void printPrimes(int no) {
		int cnt = 0;
		for(int i=2;i<=no;i++) {
			if(isPrime(i))
				cnt++;
		}
		System.out.println(cnt);
	}
}
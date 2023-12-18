class Main{
    public static void main(String[] a){
        for(int i=0;i<args.length;i++) {
			int no = Integer.parseInt(a[i]);
			printPrimes(no);
		}
    }

    public static void printPrimes(int no) {
		int cnt = 0;
		for(int i=2;i<=no;i++) {
			if(isPrime(i))
				cnt++;
		}
		System.out.println(cnt);
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
}
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n,r;
		while(true){
			m = sc.nextInt();
		    n = sc.nextInt();
			r = sc.nextInt();
			if(m == -1 && m == -1 && r ==-1) break;
			if(m == -1 || n == -1){
				System.out.println("F");
			}else if(80<=m+n){
				System.out.println("A");
			}else if(65 <= m+n && m+n < 80){
				System.out.println("B");
			}else if(50 <= m+n && m+n < 65){
				System.out.println("C");
			}else if(30 <= m+n && m+n < 50){
				if(r < 50){
					System.out.println("D");
				}else{
					System.out.println("C");
				}
			}else if(m + n < 30){
				System.out.println("F");
			}
		}
	}
}
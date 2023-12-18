public class main {
	private int page;
	private int max;
	 boolean flg = true;
	public main(int a,int b){
		page = a;
		max = b;
	}
	public void study(){
		this.page -= this.max;
		if(this.page < 0){
			this.page = 0;
			this.flg = false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l,a,b,c,d,ans = 0;
		 l = sc.nextInt();
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 d = sc.nextInt();
		main ko = new main(a,c);
		main su = new main(b,d);
		while(ko.flg && su.flg){
			ko.study();
			su.study();
			ans ++;
		}
		System.out.println(l - (ans));
	}

}
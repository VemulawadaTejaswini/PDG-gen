
class Main {

	void run(){
		int p, q;
		for(p=1;p<=9;p++){
			for(q=1;q<=9;q++){
				System.out.printf("%dx%d=%d\n", p, q, p*q);				
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
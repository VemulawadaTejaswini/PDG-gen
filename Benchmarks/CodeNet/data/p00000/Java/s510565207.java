
public class Main {

	void run(){
		int i;
		for(i=1;i<=9;i++){
			System.out.printf("%dx%d=%d\n", i, i, i*i);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
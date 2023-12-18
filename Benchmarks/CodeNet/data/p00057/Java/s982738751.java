import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int h;
	int x;
	public void ken(){
		n = sc.nextInt();
	    x = n % 2;
	    if(x==0){
	    	h = n * 2 +2;
	    }else{
	    	h = n * 2 + 1;
	    }
	    System.out.println(h);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main s = new Main();
		s.ken();
		// TODO 自動生成されたメソッド・スタブ

	}

}
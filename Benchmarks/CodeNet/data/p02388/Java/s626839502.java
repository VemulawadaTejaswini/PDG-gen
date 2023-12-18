import java.util.Scanner;

class Main {
    public void kami(){
    Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int x3 = x * x * x;
		System.out.println(x3);

    }
    public static void main(String[] args) {
        new Main().kami();
    	}

}
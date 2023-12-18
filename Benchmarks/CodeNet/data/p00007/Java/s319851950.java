import java.util.Scanner;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int money = 100000;
	int n = stdin.nextInt();
	for(int i = 0; i < n; i++){
	    money = (int)(money * 1.05);
	    if(money % 1000 > 0){
		money /= 1000;
		money++;
		money *= 1000;
	    }
	}
	System.out.println(money);
    }
}
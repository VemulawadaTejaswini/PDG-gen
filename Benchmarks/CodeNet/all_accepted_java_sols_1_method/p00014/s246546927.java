import java.util.Scanner;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);

	while(stdin.hasNextInt()){
	    int d = stdin.nextInt();
	    int limit = 600 / d;
	    int sum = 0;
	    for(int i = 0; i < limit; i++){
		sum += (d * i) * (d * i) * d;
	    }
	    System.out.println(sum);
	}
    }
}
import java.util.Scanner;

class Main {
    
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);

	while(stdin.hasNextInt()){
	    int i = stdin.nextInt() + stdin.nextInt();
	    int count = 0;
	    while(i != 0){
		count++;
		i /= 10;
	    }
	    System.out.println(count);
	}
    }
}
	    
    
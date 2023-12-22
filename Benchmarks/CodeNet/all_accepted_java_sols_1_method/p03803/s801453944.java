import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();

	if(a == 1 && b == 1){
	    System.out.println("Draw");
	}else if(a == 1){
	    System.out.println("Alice");
	}else if(b == 1){
	    System.out.println("Bob");
	}else{
	    if(a > b){
		System.out.println("Alice");
	    }else if(b > a){
		System.out.println("Bob");
	    }else{
		System.out.println("Draw");
	    }
	}
    }
}


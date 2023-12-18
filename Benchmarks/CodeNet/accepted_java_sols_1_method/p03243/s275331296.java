import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();

	if(n <= 111){
	    System.out.println(111);
	}else if(n <= 222){
	    System.out.println(222);
	}else if(n <= 333){
	    System.out.println(333);
	}else if(n <= 444){
	    System.out.println(444);
	}else if(n <= 555){
	    System.out.println(555);
	}else if(n <= 666){
	    System.out.println(666);
	}else if(n <= 777){
	    System.out.println(777);
	}else if(n <= 888){
	    System.out.println(888);
	}else{
	    System.out.println(999);
	}
    }
}

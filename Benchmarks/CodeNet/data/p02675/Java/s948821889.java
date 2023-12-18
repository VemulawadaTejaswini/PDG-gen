import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	sc.close();
    	int X = N%10;
    	if(X == 2 || X == 4 || X == 5 || X == 7 || X == 9){
    		System.out.println("hon");
    	}else if(X == 3){
    		System.out.println("bon");
    	}else{
    		System.out.println("pon");
    	}
    }
}
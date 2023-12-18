import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	sc.close();
    	if(n == m){
    		System.out.println("Yes");
    	}else{
    		System.out.println("No");
    	}

    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int i = 0; i < n; i++){
    		int a = sc.nextInt();
    		if(a % 2 == 0){
    			if(a % 3 != 0 && a % 5 != 0){
    				System.out.println("DENIED");
            		return;
    			}
        	}else{
        		continue;
        	}
    	}
    	sc.close();
    	System.out.println("APPROVED");
    }
}
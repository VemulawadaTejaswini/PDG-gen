import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int A = 0;
        int B = 0;
        for(int a = 0; a < 1001; a++){
        	for(int b = -1000; b < 1001; b++){
        		if(N == Math.pow(a, 5) - Math.pow(b, 5)){
        			A = a;
        			B = b;
        			break;
        		}
        	}
        }
        System.out.printf("%d %d", A, B);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);
    	long X = sc.nextLong();
    	int year = 0;
    	long sum = 100;

    	while(sum < X) {
    		year = year + 1;
    		sum = (long) (sum + Math.floor(sum * 0.01));
    	}
    	System.out.println(year);
    }
}
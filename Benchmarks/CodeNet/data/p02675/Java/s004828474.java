import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	int N = sc.nextInt();

    	int q = N%10;

    	if(q==2||q==4||q==5||q==7||q==9) {
    		System.out.println("hon");
    	} else {
    		if(q==0||q==1||q==6||q==8) {
    			System.out.println("pon");
    		} else {
    			System.out.println("bon");
    		}
    	}
    }
}
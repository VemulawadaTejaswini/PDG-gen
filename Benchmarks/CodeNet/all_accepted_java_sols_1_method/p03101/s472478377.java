import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	sc.close();
    	System.out.println((H * W) - (h * W +(H - h) * w));
    }
}
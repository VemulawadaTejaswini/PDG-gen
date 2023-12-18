import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int[] ary = new int[3];
    	for(int i = 0; i < 3; i++){
    		ary[i] = sc.nextInt();
		}
    	sc.close();
    	Arrays.sort(ary);
    	System.out.println(ary[0] * ary[1] / 2);
    }

}

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("input.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String[] ary = sc.nextLine().split(" ");
        boolean flg_3 = true;
        for(String str : ary){
        	if(str.equals("Y")){
        		flg_3 = false;
        	}
        }
        System.out.println(flg_3 ? "Three" : "Four");
    }
}
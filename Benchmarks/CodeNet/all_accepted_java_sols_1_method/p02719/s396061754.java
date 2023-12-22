import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();
        boolean flg = true;
        if(k == 1){
        	System.out.println(0);
        	return;
        }
        n = n % k;
        while(flg){
        	n = Math.abs(n - k);
        	if(n < Math.abs(n - k)) flg = false;
        }
        System.out.println(n);
    }
}
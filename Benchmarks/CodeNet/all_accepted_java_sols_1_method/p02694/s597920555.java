import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();
        int ans = 0;
        long t = 100;
        double r = 0.01;
        while(t < X){
        	t = t+(long)(t * r);
        	ans++;
        }
        System.out.println(ans);
    }
}
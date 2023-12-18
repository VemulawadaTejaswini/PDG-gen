import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	long A = sc.nextLong();
    	long B = sc.nextLong();
    	long C = sc.nextLong();
    	long K = sc.nextLong();
    	sc.close();
    	long ans = 0;
    	if(A >= K){
    		ans += K;
    		System.out.println(ans);
    		return;
    	}else{
    		ans += A;
    		K -= A;
    	}
    	K -= B;
    	if(K <= 0){
    		System.out.println(ans);
    		return;
    	}
    	if(C >= K){
    		ans -= K;
    		System.out.println(ans);
    		return;
    	}else{
    		ans -= C;
    		K -= C;
    	}
    	System.out.println(ans);
    }
}
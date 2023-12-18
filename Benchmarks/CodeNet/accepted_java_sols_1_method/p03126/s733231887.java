import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int ans = 0;
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] ary = new int[M];
    	for(int i = 0; i < N; i++){
    		int cnt = sc.nextInt();
    		for(int j = 0; j < cnt; j++){
    			ary[sc.nextInt()-1]++;
    		}
    	}
    	sc.close();
    	for(int sum : ary){
    		if(sum == N) ans++;
    	}
    	System.out.println(ans);
    }

}

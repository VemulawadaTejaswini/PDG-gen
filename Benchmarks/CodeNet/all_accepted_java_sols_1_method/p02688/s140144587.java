import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ary = new int[N];
        for(int i = 0; i < N; i++){
        	ary[i] = 0;
        }
        for(int i = 0; i < K; i++){
        	int d = sc.nextInt();
        	for(int l = 0; l < d; l++){
        		int A = sc.nextInt();
        		ary[A-1]++;
            }
        }
        sc.close();
        int ans = 0;
        for(int i = 0; i < N; i++){
        	if(ary[i] == 0) ans++;
        }
        System.out.println(ans);
    }
}
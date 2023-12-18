import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long[] ary = new long[N];
    	int ans = 0;
    	for(int i = 0; i < N; i++){
    		ary[i] = sc.nextLong();
		}
    	sc.close();
    	for (int i = 0; i < N; i++)
        {
            while(ary[i] % 2 == 0)
            {
                ans++;
                ary[i] /= 2;
            }
        }
    	System.out.println(ans);
    }

}

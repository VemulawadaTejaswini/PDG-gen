import java.util.Scanner;
// C - XYZ Triplets
class Main{
	public static void main(String[] args){

    	try {

		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] AN = new int[N];

        // ループの上限回数がわからない
        for (int x=1; x < 100; x++) {
            for (int y=1; y < 100; y++) {
                for (int z=1; z < 100; z++) {
                	long n =x*x + y*y + z*z + x*y + y*z + z*x;
                	if (N > n) {
                    	AN[(int) n] = AN[(int) n]+1;

                	}
                }
            }
        }

        for (int i=0; i < N; i++) {
    		System.out.println(AN[i]);
        }
		return;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("aaaa");
		}

	}
}
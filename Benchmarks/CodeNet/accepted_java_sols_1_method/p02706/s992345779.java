import java.util. *;
	
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int a[] = new int[M];
        for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
        int sum = Arrays.stream(a).sum();
        
        System.out.println(Math.max(N - sum, -1));
	}
}

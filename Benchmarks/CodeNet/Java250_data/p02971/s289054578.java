    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) throws FileNotFoundException {
     
    		//    	File file = new File("src/in.txt");
    		//    	Scanner sc = new Scanner(file);
     
    		Scanner sc = new Scanner(System.in);
     
    		int N = sc.nextInt();
    		int[] A = new int[N];
    		for(int i=0;i<N;i++) {
    			A[i] = Integer.parseInt(sc.next());
    		}
    		sc.close();
    		int[] B = A.clone();
    		Arrays.sort(B);
    		int max = B[N-1];
    		int nextmax = B[N-2];
    		for(int i=0;i<N;i++) {
    			if(A[i]==max) {
    				System.out.println(nextmax);
    			} else {
    				System.out.println(max);
    			}
    		}
    	}
    }
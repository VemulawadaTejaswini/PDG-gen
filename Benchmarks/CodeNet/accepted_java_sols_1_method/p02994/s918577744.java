import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int taste = sc.nextInt();
        int max = 0;
        
        int[] arr = new int[N];
        
        for(int i = 0; i< N;i++) {
        	arr[i] = taste +i;
        	max += arr[i];
        }
        if(arr[0] > 0) {
        	System.out.println(max-arr[0]);
        }else if (arr[N-1] < 0) {
        	System.out.println(max-arr[N-1]);
        }else {
        	System.out.println(max);
        }
    }
}
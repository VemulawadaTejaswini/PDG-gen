import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        boolean[] A = new boolean[a[n-1]+1];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(!A[a[i]]){
                if(!(i+1<n&&a[i+1]==a[i]))count++;
                for(int j = a[i];j<=a[n-1];j+=a[i])A[j]=true;
            }
        }
        System.out.println(count);
	}
}

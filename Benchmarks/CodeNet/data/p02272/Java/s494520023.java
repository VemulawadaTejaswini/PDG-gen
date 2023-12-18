import java.util.*;

class Main {

	static int[] buff = null;
	static int count = 0;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] S = new int[n];

		for (int i=0; i<n; i++) {
			S[i] = stdIn.nextInt();
		}

		mergeSort(S,n);

		for (int i=0; i<n-1; i++) {
			System.out.print(S[i]+" ");
		}
		System.out.println(S[n-1]);
		System.out.println(count);
	}

    static void mergeSort(int[] a,int n) {
        buff = new int[n];
        _mergeSort(a,0,n-1);
        buff = null;
    }

    static void _mergeSort(int[] a,int left,int right){
        if (left < right) {
            int i;
            int center = (left + right)/2;
            int p = 0;
            int j = 0;
            int k = left;

            _mergeSort(a,left,center);
            _mergeSort(a,center+1,right);

            for (i=left; i<=center; i++){
                buff[p++] = a[i];
            }
            while(i <= right && j < p){
            	count++;
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }
            while(j < p){
                a[k++] = buff[j++];
            }
        }
    }
}
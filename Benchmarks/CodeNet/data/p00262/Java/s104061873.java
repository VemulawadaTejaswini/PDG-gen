import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    while(true){
	        int n = in.nextInt();
//	        System.out.println("n="+n);
	        if(n==0) break;
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++) arr[i] = in.nextInt();
	        int res = 0;
	        while(!isFinish(arr) && res < 10000){
	            res++;
	            arr = doit(arr);
	            arr = remove(arr);           
	        }
	        if(res == 10000) res = -1;
	        System.out.println("" + res);
	    }
	}

	static boolean isFinish(int[] arr){
	    for(int i=0;i<arr.length; i++){
	        if(arr[i] != i+1) return false;
	    }
	    return true;
	}

	static int[] remove(int[] arr){
	    int c = 0;
	    for(int i : arr) if(i!=0)c++;
	    int[] res = new int[c];
	    int t = 0;
	    for(int i : arr) if(i!=0) res[t++] = i;
	    return res;
	}

	static int[] doit(int[] arr){
	    int[] res = new int[arr.length+1];
	    for(int i=0;i<arr.length; i++){
	        res[i] = arr[i]-1;
	    }
	    res[arr.length] = arr.length;
	    return res;
	}
}
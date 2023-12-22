import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	int[] a = new int [n];
	for(int i = 0 ; i < n ; i++){
	    a[i] = in.nextInt();
	}

	for(int i = n-1 ; i >= 0 ; i--){
	    if(i != 0){
		System.out.printf("%d " ,a[i]);
	    }else{
		System.out.printf("%d\n" ,a[i]);
	    }
	}
    }
}
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int K = scan.nextInt();

	Integer[] l_ = new Integer[N];
	for(int i = 0; i < N; i++){
	    l_[i] = scan.nextInt();
	}

	Arrays.sort(l_, Comparator.reverseOrder());

	int len = 0;
	for(int i = 0; i < K; i++){
	    len += l_[i];
	}

	System.out.println(len);
    }
}

	

import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
        long max = 0;
        long min = Long.MAX_VALUE;
        for(int i=0;i<N;++i){
            long a = sc.nextLong();
            if(a>max) max = a;
            if(a<min) min = a;
        }
        System.out.println(max-min);
	}
}
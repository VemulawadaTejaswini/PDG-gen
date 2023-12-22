
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		long N = Long.parseLong(sc.next());
		long M = (long) Math.sqrt(N);
		int tmp=1;
		for(int i=1;i<=(int)M;i++){
			if(N%i==0){
				tmp = i;
			}
		}
		long r = Math.max(tmp,N/tmp);
		int count = 0;
		while(r>0){
			r /= 10;
			count ++ ;
		}
		out.println(count);

	sc.close();
	out.flush();
	}
}


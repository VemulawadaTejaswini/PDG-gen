import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner buf = new Scanner(System.in);
	long i,j,k,n;
	n = buf.nextInt();
	while(n != 0){
	    i = buf.nextInt();
	    j = buf.nextInt();
	    k = buf.nextInt();
	    if((i*i) + (j*j) == (k*k)) System.out.println("YES");
	    else System.out.println("NO");
	    n--;
	}
    }
} 
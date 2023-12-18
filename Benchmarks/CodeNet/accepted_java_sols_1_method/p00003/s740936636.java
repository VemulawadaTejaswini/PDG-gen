import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner buf = new Scanner(System.in);
	int n;
	int[] data = new int[3];
	n = buf.nextInt();
	while(n != 0){
	    data[0] = buf.nextInt();
	    data[1] = buf.nextInt();
	    data[2] = buf.nextInt();
	    Arrays.sort(data);
	    if((data[0]*data[0]) + (data[1]*data[1]) == (data[2]*data[2])) System.out.println("YES");
	    else System.out.println("NO");
	    n--;
	}
    }
} 
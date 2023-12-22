import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		
		int sum = 0;
		
		Integer[] ary = new Integer[n];
		
		for(int i = 0; i < n; ++i) {
		    if(s.charAt(i) == 'I') {
		        int tmp = 1;
                sum += tmp;
		        ary[i] = sum;
		    }
		    else {
		        int tmp = -1;
                sum += tmp;
		        ary[i] = sum;
		    }
		}
		
		Arrays.sort(ary);
        //System.out.println(Arrays.toString(ary));
        
        if(ary[n-1] <= 0) System.out.println("0");
		else System.out.println(ary[n-1]);
		
	}
}
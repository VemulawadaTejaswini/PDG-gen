import java.util.*;
public class Main {
    public static void main(String[] args) {

task3();

    }

    public static void task1(){
    	Scanner s = new Scanner(System.in);
	    int n = s.nextInt(), m = s.nextInt() - 1;
	    char[] cs = s.next().toCharArray();
	    //A - a = -32
	    cs[m] += ('a' - 'A');
	    System.out.println(cs);
	}

	public static void task2(){
		Scanner s = new Scanner((System.in));
		int n = s.nextInt();
		int fh = n / 100;
		int sh = n % 100;
		System.out.println(isMonth(fh) ? (isMonth(sh) ? "AMBIGUOUS " : "MMYY") : (isMonth(sh) ? "YYMM" : "NA"));
	}

    public static Boolean isMonth(int i){
    	return (1 <= i) && (i <= 12);
	}

	public static void task3(){
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt(), k = s.nextInt();
		double ans = 0;
		for (int i = 1; i <= n; i ++){
			double tmp = i;
			while (tmp < k){
				tmp *= 2;
			}
			ans += (1/(tmp/(i * 1.0))) * (1/ (1.0 * n));
		}

		System.out.println(ans);

	}




}

import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int K = sc.nextInt();
	ArrayList<Integer> A = new ArrayList<Integer>();
	ArrayList<Integer> B = new ArrayList<Integer>();
	for (int i=0;i<N;i++) A.add(sc.nextInt());
	for (int i=0;i<M;i++) B.add(sc.nextInt());	
	A.add(Integer.MAX_VALUE);
	B.add(Integer.MAX_VALUE);
	int cou = 0;

	while (K > 0) {
	    if (A.get(0) <= B.get(0) && A.get(0) != Integer.MAX_VALUE) {
		K -= A.get(0);
		A.remove(0);
		cou++;
	    } else if (A.get(0) > B.get(0) && B.get(0) != Integer.MAX_VALUE) {
		K -= B.get(0);
		B.remove(0);
		cou++;
        }
	}
	if (K == 0)
	    System.out.print(cou);
	else { System.out.print(cou-1); }
    }
}
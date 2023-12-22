import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int be[][] = new int[100000+1][2];
        int bo[][] = new int[100000+1][2];
        for (int i=0; i<N/2; i++) {
            int e = sc.nextInt();
            int o = sc.nextInt();
            be[e][0] = e;
            bo[o][0] = o;
            be[e][1]++;
            bo[o][1]++;
        }
        Arrays.sort(be, Comparator.comparing((int[] a) -> a[1]).reversed());
        Arrays.sort(bo, Comparator.comparing((int[] a) -> a[1]).reversed());
        if(be[0][0] != bo[0][0]) System.out.println(N-be[0][1]-bo[0][1]);
        else System.out.println(Math.min(N-be[0][1]-bo[1][1], N-be[1][1]-bo[0][1]));
	}
}
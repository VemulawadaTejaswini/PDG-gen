import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            a.add(tmp);
        }
        //降順にソート
        Collections.sort(a, Collections.reverseOrder());
    
        long ans = a.get(0);
        int roop = n-2;
        int j = 1;
        for(int i=0; i<roop;i++) {
            ans += a.get(j);
            if(i % 2 == 1) j++;
        }
		System.out.println(ans);
	}
}
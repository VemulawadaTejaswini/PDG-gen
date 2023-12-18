import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner sc=new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		ArrayList<Integer> xArrayList = new ArrayList<>();

		for (int i=0; i<n; i++){
			xArrayList.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(xArrayList);

		int ans = Integer.MAX_VALUE;
		for (int i=0; i<n-k+1; i++){
			ans = Math.min(ans, Math.min(Math.abs(xArrayList.get(i)) + Math.abs(xArrayList.get(i+k-1) - xArrayList.get(i)), Math.abs(xArrayList.get(i+k-1)) + Math.abs(xArrayList.get(i) - xArrayList.get(i+k-1))));
		}

		System.out.println(ans);
	}
}
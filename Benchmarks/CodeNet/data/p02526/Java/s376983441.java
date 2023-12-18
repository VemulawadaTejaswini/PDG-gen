import java.io.*;
import java.util.*;
class Main {

	// ２分探索
	public static boolean search (int[] nums, int target) {
		
		int low = 0;
		int high = nums.length - 1;
		int middle = (low + high) / 2;
		
		while(low <= high) {
			if(nums[middle] == target) {
				
				return true;
				
			} else if (target > nums[middle]) {
				
				low = middle + 1;
				
			} else {
				
				high = middle - 1;
			}
			middle = (low + high) / 2;
		}
		return false;
		
	}
	
	public static void main(String[] args) throws IOException {
		

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		int n, q;
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(); // 一致リスト（重複なし）
		int index_s = 0;
		
		// 入力========================================================
		n = Integer.parseInt(br.readLine());
		int[] S = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++)
			S[index_s++] = Integer.parseInt(st.nextToken());
		Arrays.sort(S);
//		System.out.println("配列Sを昇順にソート");
//		System.out.println(Arrays.toString(S));
		
		q = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < q; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			if(!search(S,temp)) continue;
			
			if (!list.contains(temp)) {
				list.add(temp);
				cnt++;
			}
		}
		//=============================================================
		System.out.println(cnt);
	}

}
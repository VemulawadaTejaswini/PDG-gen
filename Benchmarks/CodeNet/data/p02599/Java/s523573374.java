import java.util.*;

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int Q = sc.nextInt();
      	int[] C = new int[N];
      	for (int i = 0; i < N; i++) {C[i] = Integer.parseInt(sc.next());}
      	
      	int l = 0, r = 0;
      	for (int q = 0; q < Q; q++) {
        	l = Integer.parseInt(sc.next());
          	r = Integer.parseInt(sc.next());
            int[] subC = Arrays.copyOfRange(C, l-1, r);
          	
          	System.out.println((test1(subC)).length);
        }
    }
  	private static int[] test1(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        int[] newNums = new int[list.size()];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = list.get(i);
        }

        return newNums;
    }
}
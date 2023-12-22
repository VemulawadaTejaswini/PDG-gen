import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nPerson = sc.nextInt();
		int mKind = sc.nextInt();
		boolean[] isAllLike = new boolean[mKind];
		for (int i = 0; i < mKind; i++) {
			isAllLike[i] = true;
		}

		for (int i = 0; i < nPerson; i++) {
			int kLikeFood = sc.nextInt();
			boolean[] nPersonLike = new boolean[mKind];
			for (int j = 0; j < kLikeFood; j++) {
				nPersonLike[sc.nextInt() - 1] = true;
			}
			for (int j = 0; j < mKind; j++) {
				if (!nPersonLike[j]) {
					isAllLike[j] = false;
				}
			}
		}
		
		int res = 0;
		for(int i=0;i<isAllLike.length;i++) {
			if(isAllLike[i]) {
				res++;
			}
		}

		System.out.println(res);
	}
}

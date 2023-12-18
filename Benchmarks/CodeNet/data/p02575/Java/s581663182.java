import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] solve(int start, int A[] , int B[] , int W){
		int H = A.length;
		if(start < 0 || start >= W){
			int r[] = new int[H];
			Arrays.fill(r, -1);
			return r;
		}
		int result[] = new int[H];
		Arrays.fill(result, -1);
		int move = 0;
		int cp = start;
		for(int i = 0 ; i < A.length ; ++i){
			int l = A[i];
			int r = B[i];
			if(cp < l || cp > r){
				move++;
				result[i] = move;
			}else{
				move += r - cp + 1;
				cp = r + 1;
				if(cp >= W){ // can't move
					break;
				}
				move++;
				result[i] = move;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A[] = new int[H];
		int B[] = new int[H];		
		for(int i = 0 ; i < A.length ; ++i){
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
		}
		int hl[] = solve(A[0] - 1 , A , B, W);
		int hr[] = solve(B[0] + 1 , A , B, W);
//		System.out.println(Arrays.toString(hl));
//		System.out.println(Arrays.toString(hr));
		for(int i = 0 ; i < H ; ++i){
			int li = hl[i];
			int ri = hr[i];
			if(li < 0 && ri < 0){
				System.out.println(-1);
			}else if(li >= 0 && ri >= 0){
				System.out.println(Math.min(li, ri));				
			}else if(li >= 0){
				System.out.println(li);
			}else{
				System.out.println(ri);				
			}
		}
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int n = Integer.parseInt(br.readLine());
		String[] prestr = br.readLine().split(" ");
		String[] instr = br.readLine().split(" ");

		int[] preorderTreeWalk = new int[n];
		int[] inorderTreeWalk = new int[n];
		for (int i=0; i < n; i++) {
			preorderTreeWalk[i] = Integer.parseInt(prestr[i]);
			inorderTreeWalk[i] = Integer.parseInt(instr[i]);
		}
//		prestr = instr = null;
		Tree t = new Tree(preorderTreeWalk, inorderTreeWalk);

		String ans = postorder(t).trim();
		System.out.println(ans);
	}

	public static class Tree {
		int root;

		Tree leftSubTree;

		Tree rightSubTree;

		public Tree(int[] pre, int[] in) {
			root = pre[0];

			int index = 0; // InorderTreeWalk ?????¨?????????in??§????????? root ??§??????????´??????????????????????
			for (int i=0; i < in.length; i++) {
				if (in[i] == root) {
					index = i;
					break;
				}
			}

			if (index != 0) {
				int[] leftSubTreeOfIn = Arrays.copyOfRange(in, 0, index);
				int[] leftSubTreeOfPre = Arrays.copyOfRange(pre, 1, index+1);
				leftSubTree = new Tree(leftSubTreeOfPre, leftSubTreeOfIn);
			}

			if (index != in.length-1) {
				int[] rightSubTreeOfPre = Arrays.copyOfRange(pre, index+1, pre.length);
				int[] rightSubTreeOfIn = Arrays.copyOfRange(in, index+1, in.length);
				rightSubTree = new Tree(rightSubTreeOfPre, rightSubTreeOfIn);
			}
//			for (int i=0; i < index; i++) {
//				leftsubTreeOfin[i] = in[i];
//			}
//			for (int i=0; i < in.length-1-index; i++) {
//				rightsubTreeOfin[i] = in[index+1+i];
//			}
		}
	}

	public static String postorder(Tree t) {
		StringBuilder sb = new StringBuilder();

		if (t.leftSubTree != null) {
			String s = postorder(t.leftSubTree);
			sb.append(s);
		}

		if (t.rightSubTree != null) {
			String s = postorder(t.rightSubTree);
			sb.append(s);
		}

		return sb.append(t.root + " ").toString();
	}
}
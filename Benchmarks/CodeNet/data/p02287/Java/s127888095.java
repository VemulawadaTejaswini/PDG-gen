import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		int[] binaryTree = new int[cnt];
		String[] tmp = s.nextLine().split(" ");
		int[] parentKey = new int[cnt];
		int[] leftKey = new int[cnt];
		int[] rightKey = new int[cnt];
		for(int i=0 ; i<cnt ; i++) {
			binaryTree[i] = Integer.parseInt(tmp[i]);
			parentKey[i] = -2000000001;
			leftKey[i] = -2000000001;
			rightKey[i] = -2000000001;
		}
		for(int i=0 ; i<cnt ; i++) {
			//????????????
			int parentNode = (i+1)/2;
			if(parentNode!=0) {
				parentKey[i] = binaryTree[parentNode-1];
			}
			//????????????
			int leftNode = (i+1)*2;
			if(cnt>=leftNode) {
				leftKey[i] = binaryTree[leftNode-1];
			}
			//????????????
			int rightNode = (i+1)*2+1;
			if(cnt>=rightNode) {
				rightKey[i] = binaryTree[rightNode-1];
			}
		}
		for(int i=0 ; i<cnt ; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("node " + (i+1) + ": key = " + binaryTree[i] + ",");
			if(i!=0) {
				sb.append(" parent key = " + parentKey[i] + ",");
			}
			if(leftKey[i]!=-2000000001) {
				sb.append(" left key = " + leftKey[i] + ",");
			}
			if(rightKey[i]!=-2000000001) {
				sb.append(" right key = " + rightKey[i] + ",");
			}
			sb.append(" ");
			System.out.println(sb.toString());
		}
	}

}
import java.util.Scanner;

public class Main {
	
	static int n;
	static int[] preorder, inorder;
	//preorder(own, left, right)
	//inorder(left, own, right)
	//postorder(left, right, own)
	
	static void recover(int fp, int lp, int fi, int li) {
		int root=fi;
		for(int i=fi; i<li; i++) {
			if(preorder[fp]==inorder[i]) {
				root=i;
				break;
			}
		}
		if(fi<root) {//左側存在するなら表示
			recover(fp+1, fp+(root-fi)+1, fi, root);
		}
		if(root<li-1) {//右側存在するなら表示
			recover(fp+(root-fi)+1, lp, root+1, li);
		}
		if(inorder[root]==preorder[0]) {
			System.out.println(inorder[root]);
		}
		else {
			System.out.print(inorder[root]+" ");
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			n=sc.nextInt();
			preorder=new int[n];
			inorder=new int[n];
			for(int i=0; i<n; i++) {
				preorder[i]=sc.nextInt();
			}
			for(int i=0; i<n; i++) {
				inorder[i]=sc.nextInt();
			}
			recover(0, n, 0, n);

		}
	}
}

import java.util.Scanner;

public class Main {

	private static int rootNumber;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] preorder = new int[n];
		for (int i = 0; i < n; i++) {
			preorder[i] = sc.nextInt();
		}

		int[] inorder = new int[n];
		for (int i = 0; i < n; i++) {
			inorder[i] = sc.nextInt();
		}

		rootNumber = 0;
		postorder(inorder,inorder,preorder[0],preorder);
		System.out.println();

	}

	public static void postorder(int[] inorder, int[] order, int root, int[] preorder){
		for (int i = 0; i < order.length; i++) {
			if (order[i] == root) {
				if (i != 0) {
					rootNumber++;
					int newRoot = preorder[rootNumber];
					int[] order1 = new int[i];

					for (int j = 0; j < order1.length; j++) {
						order1[j] = inorder[j];
					}

					postorder(inorder, order1, newRoot, preorder);

				}

				if (i != order.length - 1) {
					rootNumber++;
					int newRoot = preorder[rootNumber];
					int[] order1 = new int[order.length -1 - i];

					for (int j = 0; j < order1.length; j++) {
						order1[j] = inorder[i+1+j];
					}

					postorder(inorder, order1, newRoot, preorder);
				}

				if (order[i] != preorder[0]) {
					System.out.print(order[i] + " ");
				} else {
					System.out.print(order[i]);
				}


			}
		}
	}
}
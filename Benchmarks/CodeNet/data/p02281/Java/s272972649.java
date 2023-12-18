import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BinaryTree[] trees = new BinaryTree[n];
		for(int i = 0; i < n; i++) trees[i] = new BinaryTree(i);

		for(int i = 0; i < n; i++) {
			int node = scanner.nextInt();
			int left = scanner.nextInt();
			int right = scanner.nextInt();

			trees[node].son.add(left);
			trees[node].son.add(right);
			if(left >= 0) {
				trees[left].parent = node;
				trees[left].sibling = right;
			}
			if(right >= 0) {
				trees[right].parent = node;
				trees[right].sibling = left;
			}
		}

		int root = -1;
		for(int i = 0; i < trees.length; i++) if(trees[i].parent == -1) root = i;

		ArrayList<Integer> preorderRes = new ArrayList<Integer>();
		preorderRes = BinaryTree.preorder(trees, preorderRes, root);
		System.out.println("Preorder");
		dispList(preorderRes);

		ArrayList<Integer> inorderRes = new ArrayList<Integer>();
		inorderRes = BinaryTree.inorder(trees, inorderRes, root);
		System.out.println("Inorder");
		dispList(inorderRes);

		ArrayList<Integer> postorderRes = new ArrayList<Integer>();
		postorderRes = BinaryTree.postorder(trees, postorderRes, root);
		System.out.println("Postorder");
		dispList(postorderRes);
	}

	static void dispList(ArrayList<Integer> list) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < list.size(); i++) sb.append(" ").append(list.get(i));
		System.out.println(sb);
	}
}

class BinaryTree{
	int node;
	int parent;
	int sibling;
	ArrayList<Integer> son = new ArrayList<Integer>();

	BinaryTree(int node){
		this.node = node;
		parent = -1;
		sibling = -1;
	}

	int findDepth(BinaryTree[] trees) {
		int res = 0;
		int tmp = node;
		while(trees[tmp].parent != -1) {
			tmp = trees[tmp].parent;
			res++;
		}
		return res;
	}

	int findHight(BinaryTree[] trees, int ans) {
		if(son.get(0) == -1) {
			if(son.get(1) == -1) return ans;
			else return trees[son.get(1)].findHight(trees, ans + 1);
		}
		else {
			if(son.get(1) == -1) return trees[son.get(0)].findHight(trees, ans + 1);
			else return Math.max(trees[son.get(0)].findHight(trees, ans + 1), trees[son.get(1)].findHight(trees, ans + 1));
		}
	}

	int findDegree() {
		if(son.get(0) == -1 && son.get(1) == -1) return 0;
		else if(son.get(0) == -1 || son.get(1) == -1) return 1;
		else return 2;
	}

	static ArrayList<Integer> preorder(BinaryTree[] trees, ArrayList<Integer> res, int cur) {
		res.add(cur);
		if(trees[cur].son.get(0) >= 0) res = preorder(trees, res, trees[cur].son.get(0));
		if(trees[cur].son.get(1) >= 0) res = preorder(trees, res, trees[cur].son.get(1));
		return res;
	}

	static ArrayList<Integer> inorder(BinaryTree[] trees, ArrayList<Integer> res, int cur) {
		if(trees[cur].son.get(0) >= 0) res = inorder(trees, res, trees[cur].son.get(0));
		res.add(cur);
		if(trees[cur].son.get(1) >= 0) res = inorder(trees, res, trees[cur].son.get(1));
		return res;
	}

	static ArrayList<Integer> postorder(BinaryTree[] trees, ArrayList<Integer> res, int cur) {
		if(trees[cur].son.get(0) >= 0) res = postorder(trees, res, trees[cur].son.get(0));
		if(trees[cur].son.get(1) >= 0) res = postorder(trees, res, trees[cur].son.get(1));
		res.add(cur);
		return res;
	}
}

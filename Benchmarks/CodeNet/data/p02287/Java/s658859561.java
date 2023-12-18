public class Solution {
    /**
     * @param root, the root of binary tree.
     * @return true if it is a complete binary tree, or false.
     */
    public boolean isComplete(TreeNode root) {
    	if (root == null) {
    		return true;
    	}

    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
        boolean flag = false;
    	while (!queue.isEmpty()) {
    		TreeNode node = queue.poll();
    		if (flag && (node.left != null || node.right != null)) {
    		    return false;
    		}
    		if (node.left == null && node.right != null) {
    			return false;
    		} else if (node.left == null || node.right == null) {
    		    flag = true;
    		} 
    		if (node.left != null) {
        		queue.offer(node.left);    		    
    		}
            if (node.right != null) {
                queue.offer(node.right);    
            }
    	}

    	return true;
    }

}

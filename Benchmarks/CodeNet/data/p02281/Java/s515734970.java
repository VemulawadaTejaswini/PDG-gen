
class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] parent = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = Integer.parseInt(sc.next());
            left[i] = Integer.parseInt(sc.next());
            right[i] = Integer.parseInt(sc.next());
        }
        Tree tree = new Tree(parent, left, right);
        System.out.println("Preorder");
        tree.preorderParse(tree.getRoot());
        System.out.println();
        System.out.println("Inorder");
        tree.inorderParse(tree.getRoot());
        System.out.println();
        System.out.println("Postorder");
        tree.postorderParse(tree.getRoot());
        System.out.println();
    }

    static class Node{
        public  int parent;
        public  int left;
        public  int right;
    }

    static class Tree{
        private final Node[] nodes;

        public Tree(int[] parent, int[] left, int[] right){
            Node[] nodes = new Node[parent.length];
            for(int i=0; i<parent.length; i++)  nodes[i] = new Node();
            for(int i=0; i<parent.length; i++)  nodes[i].parent = -1;
            for(int i = 0; i<parent.length; i++){
                nodes[parent[i]].left = left[i];
                nodes[parent[i]].right = right[i];
                if(left[i] != -1)   nodes[left[i]].parent = parent[i];
                if(right[i] != -1)   nodes[right[i]].parent = parent[i];
            }
            this.nodes = nodes;
        }
        public int getRoot(){
            for(int i=0; i<nodes.length; i++){
                if(nodes[i].parent == -1)   return i;
            } 
            return -1;
        }
        public void preorderParse(int index ){
            if( index != -1 ){
                System.out.print(" "+index);
                int left = this.nodes[index].left;
                preorderParse(left);
                int right = this.nodes[index].right;
                preorderParse(right);
            }
        }

        public void inorderParse(int index ){
            if( index != -1 ){
                int left = this.nodes[index].left;
                inorderParse(left);
                System.out.print(" "+index);
                int right = this.nodes[index].right;
                inorderParse(right);
            }
        }

        public void postorderParse(int index ){
            if( index != -1 ){
                int left = this.nodes[index].left;
                postorderParse(left);
                int right = this.nodes[index].right;
                postorderParse(right);
                System.out.print(" "+index);
            }
        }

    }
}



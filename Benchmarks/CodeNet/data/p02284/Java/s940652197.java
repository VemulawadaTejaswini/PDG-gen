

class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        // int[] keys = new int[n];
        BinaryTree binaryTree = new BinaryTree();
        for(int i=0; i<n; i++){
            String order = sc.next();
            switch(order){
                case "insert":
                    binaryTree.root = binaryTree.add(binaryTree.root, Integer.parseInt(sc.next()));
                    break;
                case "print":
                    binaryTree.print();
                    break;
                case "find":
                    binaryTree.find(binaryTree.root, Integer.parseInt(sc.next()));
                    break;
                default:
                    break;
            }
        }
        
    }

    static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key){
            this.key = key;
        }

    }

    static class BinaryTree{
        Node root = null;

        Node getRoot(){
            return this.root;
        }

        void print(){
            innorder(this.root);
            System.out.println();
            preorder(this.root);
            System.out.println();
        }
        void preorder( Node node){
            if(node == null){
                return;
            }
            System.out.print(" "+node.key);
            preorder(node.left);
            preorder(node.right);
        }
        void innorder(Node node){
            if(node == null){
                return;
            }   
            innorder(node.left);
            System.out.print(" "+node.key);
            innorder(node.right);
        }


        public Node add(Node current, int key){
            if(current == null) {
                return new Node(key);
            }
            if( key >= current.key){
                current.right = add(current.right, key);
            } else {
                current.left = add(current.left, key);
            }
            return current;
        }

        public void find( Node node, int key){
            if(node == null){
                System.out.println("no");
                return ;
            }
            if(node.key == key){
                System.out.println("yes");
                return ;
            }

            if( key > node.key){
                find(node.right, key);
            } else {
                find(node.left, key);
            }

        }

    }
}



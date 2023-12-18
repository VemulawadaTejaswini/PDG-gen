

class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] pre = new int[n];
        for(int i=0; i<n; i++)  pre[i] = Integer.parseInt(sc.next());
        int[] ino = new int[n];
        for(int i=0; i<n; i++)  ino[i] = Integer.parseInt(sc.next());

        Tree tree = new Tree(pre, ino);
        tree.rebuild(0, n);
        tree.showAns();
    }

    static class Tree{
        private final int[] pre;
        private final int[] ino;
        private int rootIdPre = 0;
        private int[] post;
        private int numAns = 0;

        public Tree(int[] pre, int[] ino){
            this.pre = pre;
            this.ino = ino;
            this.post = new int[pre.length];
        }

        private void rebuild(int left, int right){
            if(left >= right)   return;
            int rootNum = pre[this.rootIdPre++];
            int rootIdIno = searchRootInorder(rootNum, left, right);
            
            rebuild(left, rootIdIno);
            rebuild(rootIdIno+1, right);
            this.post[this.numAns++] = rootNum;
        }

        private int searchRootInorder( int rootValue, int left, int right){
            for(int i=left; i<right; i++){
                if(this.ino[i] == rootValue) return i;
            }
            return -1;
        }
        public void showAns(){
            for(int i=0; i<this.post.length; i++){
                if(i == this.post.length-1){
                    System.out.println(this.post[i]);
                } else {
                    System.out.print(this.post[i]+" ");
                }
            }
        }


    }
}



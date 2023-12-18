import java.util.Scanner;

public class Main {

   static class Node{
        int key;
        Node parent;
        Node left;
        Node right;
    }

    static Node T;

    static void insert(Node z){
        Node y = null;
        Node R = T;
        while (R != null){
            y = R;
            if(z.key < R.key){
                R = R.left;
            }
            else {
                R = R.right;
            }
        }

        z.parent = y;
        if(y == null){
            T = z;
        }
        else if(z.key < y.key){
            y.left = z ;
        }
        else if(z.key > y.key){
            y.right = z;
        }
    }

    static int idx = 0;

    static void inOrder(Node u){
        if(u == null) return;

        inOrder(u.left);
        System.out.print(" " + u.key);
        inOrder(u.right);
    }

    static void preOrder(Node u){
        if(u == null) return;
        System.out.print(" " + u.key);
        preOrder(u.left);
        preOrder(u.right);
    }


    static Node find(Node c,int key){
        if(c == null) return null;
        if(c.key == key){
            return c;
        }
        else if(c.key > key){
           return find(c.left,key);
        }else{
            return find(c.right,key);
        }
    }


    static void delete(Node z){
        //设要删除的结点 y
        Node y ;
        if(z.left == null || z.right == null){
            y = z;
        }
        else {
            // 要删除的对象 有两个子结点 则获取z 的后继结点
            y = getSuccessor(z);
        }

        //确定 y 结点的子结点 x
        Node x = null;
        if(y.left != null){
            x = y.left;
        }
        else {
            x = y.right;
        }

        //设置x的父节点
        if(x != null){
            x.parent = y.parent;
        }

        if(y.parent == null){
            T = x;
        }
        else if(y.parent.left == y){
            y.parent.left = x;
        }
        else {
            y.parent.right = x;
        }

        if(z != y){
            z.key = y.key;
        }

        y = null;
    }


    static Node getSuccessor(Node x){
        if(x.right != null){
            return getMinimum(x.right);
        }

        return x;
    }

    static Node getMinimum(Node x){
        while (x.left != null){
            x = x.left;
        }
        return x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node temp;
        int key = 0;
        for(int i = 0 ; i < n; i ++){
            String oper = sc.next();
            if("insert".equals(oper)){
                key = sc.nextInt();
                temp = new Node();
                temp.key = key;
                insert(temp);
            }else if ("print".equals(oper)){
                idx = 0;
                inOrder(T);
                System.out.println();
                idx = 0;
                preOrder(T);
                System.out.println();
            }else if("find".equals(oper)){
                key = sc.nextInt();
                Node tmp = find(T,key);
                System.out.println(tmp != null ? "yes" : "no");
            }else if("delete".equals(oper)){
                key = sc.nextInt();
                Node z = find(T,key);
                if(z != null){
                    delete(z);
                }
            }
        }
    }
}


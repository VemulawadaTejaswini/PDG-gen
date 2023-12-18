import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.io.*;
//import java.util.stream.IntStream;



public class Main {

    static class Node{
        Node parent = null;
        Node leftChild = null;
        Node rightChild = null;
        Integer key = null;

        public Node(){};
        public Node(int key){
            this.key = key;
        };
    }

    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            Node root = new Node();

            for(int i=0; i<n;i++){
                String command = br.readLine();
                if(command.charAt(0) == 'i'){
                    int key = Integer.parseInt(command.split(" ")[1]);
                    insert(root, key);
                }else if (command.charAt(0) == 'p'){
                    print(root);
                }else if (command.charAt(0) == 'f'){
                    int key = Integer.parseInt(command.split(" ")[1]);
                    find(root, key);
                }

            }
        } catch (IOException e){e.printStackTrace();}

    }

    public static void find(Node root, int key) {
        Node x = root;
        boolean ans = false;

        while(x !=null){
            if(x.key == key){
                ans = true;
                break;
            } else if(x.key<key){
                x = x.rightChild;
            } else if(x.key>key){
                x = x.leftChild;
            }
        }
        System.out.println(ans ? "yes" : "no");
    }

    public static void insert(Node root, int key) {
        // xとxParentを木の下に移動していく
        Node x = root;
        Node y = new Node(key);
        Node xParent = null;

        if(x.key == null){
            x.key = y.key; //x = y x.keyの値が変更できないことに注意。xに入っているのはあくまでアドレス値
            return;
        }
        
        while(x != null){
            xParent = x;
            if(x.key < y.key){
                x = x.rightChild;
            } else {
                x = x.leftChild;
            }
        }

        y.parent = xParent;
        if(xParent == null){
            x = y;
        }else if(xParent.key<y.key){
            xParent.rightChild = y;
        }else if(xParent.key>y.key){
            xParent.leftChild = y;
        }

    }

    public static void print(Node root){
        List<Integer> preList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();

        preOrder(root, preList);
        inOrder(root, inList);

        inList.stream().forEach((val)->{System.out.print(" " + val);});
        System.out.println();
        preList.stream().forEach((val)->{System.out.print(" " + val);});
        System.out.println();
    }
    public static void preOrder(Node root, List<Integer> preList){
        Node x = root;
        if(x == null){
            return;
        }
        preList.add(x.key);
        preOrder(x.leftChild, preList);
        preOrder(x.rightChild, preList);
    }
    public static void inOrder(Node root, List<Integer> inList){
        Node x = root;
        if(x == null){
            return;
        }
        inOrder(x.leftChild, inList);
        inList.add(x.key);
        inOrder(x.rightChild, inList);
    }
}




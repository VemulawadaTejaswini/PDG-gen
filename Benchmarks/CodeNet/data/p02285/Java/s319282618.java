import java.util.*;
import java.io.*;

public class Main{
    static StringBuffer sb=new StringBuffer();
    static Node root=null;
    static class Node{
        int key;
        Node parent;
        Node leftChild;
        Node rightChild;
        ArrayList<Node> childList=new ArrayList<Node>();
    }
    public static void main (String args[]){
        //初期処理
        // Scanner sc=new Scanner(System.in);
        // int n=Integer.parseInt(sc.nextLine());
        // String[] sElementArray=sc.nextLine().split(" ");
        // int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
        // sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       try{
            int n= Integer.parseInt(br.readLine());

            Node[] allNode=new Node[n];
            for(int i=0;i<n;i++){
                allNode[i]=new Node();
            }

            for(int i=0;i<n;i++){
                String[] sElementArray = br.readLine().split(" ");
                // int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
                Node x=new Node();

                if(sElementArray[0].equals("insert")){
                    x.key=Integer.parseInt(sElementArray[1]);
                    insert(x,root);
                }
                if(sElementArray[0].equals("print")){
                    inorder(root);
                    sb.append("\n");
                    preorder(root);
                    sb.append("\n");
                }
                if(sElementArray[0].equals("find")){
                    int searchKey=Integer.parseInt(sElementArray[1]);
                    if(find(searchKey, root)!=null){
                        sb.append("yes\n");
                    }else{
                        sb.append("no\n");
                    }
                }
                if(sElementArray[0].equals("delete")){
                    int key=Integer.parseInt(sElementArray[1]);
                    delete(key,root);
                }
                
                allNode[i]=x;

            
            }
            System.out.print(sb);
        }catch(IOException e){e.printStackTrace();}

    }

        //node xをnode yの下に挿入
        static void insert(Node x,Node y){

            if(y==null){
                x.parent=null;
                root=x;
                return;
            }

            if(x.key>y.key){
                if(y.rightChild!=null){
                    insert(x,y.rightChild);
                }
                if(y.rightChild==null){
                    y.rightChild=x;
                    x.parent=y;
                }
            }
            if(x.key<y.key){
                if(y.leftChild!=null){
                    insert(x,y.leftChild);
                }
                if(y.leftChild==null){
                    y.leftChild=x;
                    x.parent=y;
                }
            }
        }

        static Node find(int searchKey,Node root){
            Node x=root;
            while(x!=null){
                if(x.key==searchKey){
                    return x;
                }
                if(x.key>searchKey){
                    x=x.leftChild;
                    continue;
                }
                if(x.key<searchKey){
                    x=x.rightChild;
                    continue;
                }
            }
            return null;
        }

        static void delete(int key,Node root){
            Node x=Main.find(key,root); //値を置き換えるノード
            Node y;                     //xの位置に移動するノード、こいつを消す
            //子なし
            if(x.leftChild==null&&x.rightChild==null){
                if(x.parent.leftChild==x){
                    x.parent.leftChild=null;
                }else if(x.parent.rightChild==x){
                    x.parent.rightChild=null;
                }
                return;
            }//子が左だけ
            else if(x.leftChild!=null && x.rightChild==null){
                y=x.leftChild;
                y.parent=x.parent;
                if(x.parent.leftChild==x){
                    x.parent.leftChild=x.leftChild;
                }else if(x.parent.rightChild==x){
                    x.parent.rightChild=x.leftChild;
                }
            }//子が右だけ
            else if(x.leftChild==null && x.rightChild!=null){
                y=x.rightChild;
                y.parent=x.parent;
                if(x.parent.leftChild==x){
                    x.parent.leftChild=x.rightChild;
                }else if(x.parent.rightChild==x){
                    x.parent.rightChild=x.rightChild;
                }
            }else{
                y=Main.getSuccessor(x);//この場合yに左の子は存在しない
                x.key=y.key;
                if(y.parent.leftChild==y){
                    y.parent.leftChild=y.rightChild;
                }else if(y.parent.rightChild==y){
                    y.parent.rightChild=y.rightChild;
                }
            }
            

        }

        static Node getSuccessor(Node x) {
            if(x.rightChild != null) {
                return getMinimum(x.rightChild);
            }
            Node y = x.parent;
            while(y != null && x == y.rightChild) {
                x = y;
                y = y.parent;
            }
            return y;
        }

        static Node getMinimum(Node x){
            while(x.leftChild!=null){
                x=x.leftChild;
            }
            return x;
        }

        static void preorder(Node x){
            sb.append(" "+x.key);
            if(x.leftChild!=null){
                preorder(x.leftChild);
            }
            if(x.rightChild!=null){
                preorder(x.rightChild);
            }
        }

        static void inorder(Node x){
            if(x.leftChild!=null){
                inorder(x.leftChild);
            }
            sb.append(" "+x.key);
            if(x.rightChild!=null){
                inorder(x.rightChild);
            }
        }

        static void postorder(Node x){
            if(x.leftChild!=null){
                postorder(x.leftChild);
            }
            if(x.rightChild!=null){
                postorder(x.rightChild);
            }
            sb.append(" "+x.key);
        }
    }
    

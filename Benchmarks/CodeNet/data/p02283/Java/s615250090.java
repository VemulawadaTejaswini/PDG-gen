import java.io.*;
import java.util.StringTokenizer;
   
class Main{
   
static final PrintWriter out=new PrintWriter(System.out);

static class binarySearchTree{

static class Node{
int id;
Node p;
Node l;
Node r;
int deg;
Node(int id){
this.id=id; this.p=null; this.l=null; this.r=null; this.deg=0;
}
}

private static Node root;

binarySearchTree(){
root=null;
}

private static void insert(int v){
if(root==null) root=new Node(v);
else __insert(new Node(v));
}

private static void __insert(Node z){
Node x=root;
Node y=null;
while(x!=null){
y=x;
if(z.id<x.id) x=x.l;
else x=x.r;
}
z.p=y;
if(z.id<y.id) y.l=z;
else y.r=z;
y.deg++;
}

static void print(){
inorder(root);
out.println();
preorder(root);
out.println();
}

static void preorder(Node now){
if(now.id<0) return;
out.print(" "+now.id);
preorder(now.l);
preorder(now.r);
}
 
static void inorder(Node now){
if(now.id<0) return;
inorder(now.l);
out.print(" "+now.id);
inorder(now.r);
}
 
static void postorder(Node now){
if(now.id<0) return;
postorder(now.l);
postorder(now.r);
out.print(" "+now.id);
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st;
binarySearchTree tree=new binarySearchTree();
int num=Integer.parseInt(br.readLine());
for(int i=0;i<num;i++){
st=new StringTokenizer(br.readLine());
String command=st.nextToken();
int n=Integer.parseInt(st.nextToken());
if("insert".equals(command)) tree.insert(n);
else tree.print();
}
out.flush();
}
}
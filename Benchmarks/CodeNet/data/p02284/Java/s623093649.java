import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}

	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		BinarySearchTree bst = new BinarySearchTree(n);
		for(int i=0; i<n; i++) {
			String cmd = in.br.readLine();
			if(cmd.charAt(0) == 'i'){
				bst.inset(Integer.parseInt(cmd.substring(7)));
			}else if(cmd.charAt(0) == 'f'){
				out.println(bst.find(Integer.parseInt(cmd.substring(5))) ? "yes" : "no");
			}else{
				out.print(' ');
				output(out, bst.getNodeIdListInOrder(), bst.size());
				out.print(' ');
				output(out, bst.getNodeIdListPreOrder(), bst.size());
			}
		}
//		out.println();
//		out.flush();
	}

	
	public void output(PrintWriter out, int[] a, int len) {
		int off = 0;
		out.print(a[off]);
		for(int i=off+1; i<len; i++){
			out.print(' ');
			out.print(a[i]);
		}
		out.println("");
		out.flush();
	}
	
	
}

class BinarySearchTree {

	protected int[] left = null;
	protected int[] right = null;
	protected int[] parent = null;
	protected int maxNodes = 0;
	protected int[] values = null;
	protected int[] nodeBuf = null;
	
	protected int nodePtr = 0;
	
	public BinarySearchTree(int maxNodes) {

		this.maxNodes=maxNodes;
		
		left = new int[maxNodes];
		right = new int[maxNodes];
		parent = new int[maxNodes];
		values = new int[maxNodes];
		nodeBuf = new int[maxNodes];
		
		Arrays.fill(left, -1);
		Arrays.fill(right, -1);
		Arrays.fill(parent, -1);
		Arrays.fill(values, -1);
		Arrays.fill(nodeBuf, -1);
	}
	
	public int size() {
		return nodePtr;
	}

	public int getRootId() {
		int rootId = 0;
		while(parent[rootId] != -1)
			rootId = parent[rootId];
		return rootId;
	}
	
	public void setNodeValue(int id, int value) {
		if(id<maxNodes) values[id] = value;
	}

	public void setLeftNodeChild(int id, int value) {
		left[id] = (nodePtr<maxNodes) ? nodePtr++ : -1;
		if(left[id] != -1) {
			parent[left[id]] = id;
		}
		values[left[id]] = value;
	}

	public void setRightNodeChild(int id, int value) {
		right[id] = (nodePtr<maxNodes) ? nodePtr++ : -1;
		if(right[id] != -1) {
			parent[right[id]] = id;
		}
		values[right[id]] = value;
	}
	
	public void inset(int value) {
		if(nodePtr == 0){
			setNodeValue(nodePtr++,value);
		}else{
			int curId = getRootId();
			int curParId = -1;
			while (curId != -1) {
				curParId = curId;
				if(value < values[curId]){
					curId = left[curId];
				}else{
					curId = right[curId];
				}
			}
			if (value < values[curParId]){
				setLeftNodeChild(curParId,value);
			} else {
				setRightNodeChild(curParId,value);
			}
		}
	}
	
	public boolean find(int value) {
		if(nodePtr == 0){
			return false;
		}else{
			int curId = getRootId();
			while (curId != -1 && values[curId] != value) {
				if(value < values[curId]){
					curId = left[curId];
				}else{
					curId = right[curId];
				}
			}
			return curId != -1 && values[curId] == value;
		}
	}
	
	public int[] getNodeIdListPreOrder() {
		preOrder(0,getRootId());
		return nodeBuf;
	}
	
	protected int preOrder(int nodePtr, int id) {
		if(id == -1) return nodePtr;
		nodeBuf[nodePtr++] = values[id];
		nodePtr = preOrder(nodePtr,left[id]);
		nodePtr = preOrder(nodePtr,right[id]);
		return nodePtr;
	}
	
	public int[] getNodeIdListInOrder() {
		inOrder(0,getRootId());
		return nodeBuf;
	}
	
	protected int inOrder(int nodePtr, int id) {
		if(id == -1) return nodePtr;
		nodePtr = inOrder(nodePtr,left[id]);
		nodeBuf[nodePtr++] = values[id];
		nodePtr = inOrder(nodePtr,right[id]);
		return nodePtr;
	}
	
}

class InputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int nextInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    
    public int[] nextInt(int[] a, int num) throws NumberFormatException, IOException{
        int i=0;
        while(i<num) {
            for(String s: br.readLine().split(" ")){
            	if(i<num) {
                    a[i++] = Integer.parseInt(s);
            	}
            }
        }
        return a;
    }
}
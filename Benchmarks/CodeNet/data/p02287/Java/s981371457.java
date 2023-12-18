import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}

	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int H = in.nextInt();
		int[] heapData = in.nextInt(new int[H],H);
		BinaryHeap bh = new BinaryHeap(heapData);
		for(int i=0; i<H; i++) {
			out.println(bh.show(i));
		}
		out.flush();
	}
	
	
}

class BinaryHeap {
	public int[] data = null;
	
	public BinaryHeap(int maxNodes) {
		data = new int[maxNodes];
	}
	
	public BinaryHeap(int[] data) {
		this.data = data;
	}
	
	public int get(int i) {
		return data[i];
	}
	
	public void set(int i, int value) {
		data[i] = value;
	}

	public int getParent(int i){
		if(i<=0 || data.length<=i) return -1;
		return (i+1)/2 - 1;
	}

	public int getLeft(int i){
		if(i<0 || data.length/2<=i) return -1;
		return (i+1)*2 - 1;
	}

	public int getRight(int i){
		if(i<0 || (data.length-1)/2<=i) return -1;
		return (i+1)*2;
	}
	
	public String show(int id){
		StringBuilder sb = new StringBuilder("node "+(id+1)+": key = "+data[id]+", ");
		int parentId = getParent(id);
		if(parentId != -1)
			sb.append("parent key = "+data[parentId]+", ");
		int leftId = getLeft(id);
		if(leftId != -1)
			sb.append("left key = "+data[leftId]+", ");
		int rightId = getRight(id);
		if(rightId != -1)
			sb.append("right key = "+data[rightId]+", ");
		return sb.toString();
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
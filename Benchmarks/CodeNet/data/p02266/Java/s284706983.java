import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
   
public class Main {
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
     
    public void exec() throws IOException {
        SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        out.print(new SectionDiagram().analyze(in.br.readLine()));
        out.flush();
    }
}

class SectionDiagram {
	public static final String EOF = System.lineSeparator();

	Deque<Integer> downhillDeque = new ArrayDeque<>();
	Deque<WaterHazardElement> waterHazardDeque = new ArrayDeque<>();
	int A = 0;
	int[] L = null;
	
	public SectionDiagram analyze(String s) {
		int len = s.length();
		for(int i=0; i<len; i++) {
			switch(s.charAt(i)) {
			case '\\':
				downhillDeque.push(i);
				break;
			case '/':
				if(!downhillDeque.isEmpty()) {
					int start = downhillDeque.pop();
					WaterHazardElement wh = new WaterHazardElement(start,i);
					while(true) {
						if(!waterHazardDeque.isEmpty()){
							WaterHazardElement whPre = waterHazardDeque.removeFirst();
							if(wh.include(whPre)) {
								wh.addChild(whPre);
							} else {
								waterHazardDeque.addFirst(whPre);
								waterHazardDeque.addFirst(wh);
								break;
							}
						}else{
							waterHazardDeque.addFirst(wh);
							break;
						}
					}
				}
				break;
			}
		}
		
		L = new int[waterHazardDeque.size()];
		for(int i=0; !waterHazardDeque.isEmpty(); i++){
			A += L[i] = waterHazardDeque.removeLast().getCapacity();
		}

		return this;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(A).append(EOF);
		if(L != null && L.length>0){
			sb.append(L.length).append(" ");
			for(int i=0; i<L.length; i++) {
				if(i>0) sb.append(" ");
				sb.append(L[i]);
			}
			sb.append(EOF);
		} else {
			sb.append(0).append(EOF);
		}
		return sb.toString();
	}
	
}

class WaterHazardElement {
	int st = -1;
	int ed = -1;
	ArrayDeque<WaterHazardElement> children;
	
	public WaterHazardElement(int st, int ed) {
		this.st = st;
		this.ed = ed;
	}
	
	public void addChild(WaterHazardElement s) {
		if(children == null) {
			children = new ArrayDeque<WaterHazardElement>();
		}
		children.push(s);
	}
	
	public int getCapacity() {
		int totalCapacity = 0;
		if(children != null && !children.isEmpty()) {
			for(WaterHazardElement s: children) {
				totalCapacity += s.getCapacity();
			}
		}
		return totalCapacity + ed - st;
	}
	
	public boolean include(WaterHazardElement s) {
		return this.st < s.st && s.ed < this.ed;
	}
	
}
 
class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
        return br.readLine().split(delim);
    }
     
    public int readInt() throws NumberFormatException, IOException{
        return Integer.parseInt(br.readLine());
    }
     
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
                if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
                }
            }
        }
        return a;
    }
 
     
}
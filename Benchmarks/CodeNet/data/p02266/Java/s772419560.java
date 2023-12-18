import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;


public class Main {
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		Stack<Integer> SlopeStack = new Stack<Integer>();
		Stack<Pool> poolStack = new Stack<Pool>();

		String ch;
		int are=0;
		int sum = 0;
		ch = sc.nextLine();
		for (int i=0; i<ch.length(); i++){
			
			switch(ch.charAt(i)){
			case'\\':
				SlopeStack.push(i);
				break;
			case '/':
				if (!SlopeStack.isEmpty()) {
					Pool v = new Pool(SlopeStack.pop(),i);
					while (!poolStack.isEmpty()) {
						Pool latest = poolStack.pop();
						if (!v.isChild(latest)) {
							poolStack.push(latest);
							break;
						}
						v.addSize(latest.getSize());
					}
					poolStack.push(v);
				}
				break;
			case '_':
				break;
			}
		}

		int[] areaSize = new int[poolStack.size()];
		for (int i = 0; i < areaSize.length; i++) {
			areaSize[i] = poolStack.pop().getSize();
			sum += areaSize[i];
		}
		System.out.println(sum);
		System.out.print(areaSize.length);
		for (int i = areaSize.length - 1; i >= 0; i--) {
			System.out.print(" " + areaSize[i]);
		}
		System.out.println();
	}
}
class Pool {
	int left;
	int right;
	int area;
	Pool(int left, int right) {
		this.left = left;
		this.right = right;
		this.area = right - left;
	}
	void pool(){
		left = 0;
		right = 0;
	}
	public void addSize(int i){
		area += i;
	}
	public boolean isChild(Pool pool) {
		return left < pool.left && right > pool.right;
	}
	public int getSize() {
		return area;
	}
}

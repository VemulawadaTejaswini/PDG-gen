

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		PriorQueue que = new PriorQueue();
		String op = null;
		int x = 0;
		while(true) {
			op = sc.next();
			if(op.equals("insert")) {
				x = sc.nextInt();
				que.insert(x);
			}else if(op.equals("extract")) {
				System.out.println(que.pop());
			}else {
				break;
			}
		}
	}

	
}
class PriorQueue{
	
	int value[] = new int[30000000];
	int h = 0;
	
	public void insert(int x) {
		h++;
		value[h] = x;
		int index = h;
		
		while(index>1 && value[index]>value[index/2]) {
			value[index] ^= value[index/2];
			value[index/2] ^= value[index];
			value[index] ^= value[index/2];
			index /= 2;
		}
		return;
	}
	
	public int pop() {
		int result = value[1];
		value[1] = value[h];
		h--;
		
		int index = 1;
		while(index<=h) {
			int l = index * 2;
			int r = index * 2 + 1;
			int maxi = index;
			if(l<=h && value[l]>value[maxi]) {
				maxi = l;
			}
			if(r<=h && value[r]>value[maxi]) {
				maxi = r;
			}
			if(maxi != index) {
				value[maxi] ^= value[index];
				value[index] ^= value[maxi];
				value[maxi] ^= value[index];
				index = maxi;
			}else {
				break;
			}
		}
		
		return result;
	}
	
	public int top() {
		return value[1];
	}
	
	public boolean isEmpty() {
		return h==0;
	}
	
}


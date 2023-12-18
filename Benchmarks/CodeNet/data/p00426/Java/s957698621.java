import java.io.*;
import java.util.*;

enum OPERATION {
	A_TO_B,
	B_TO_A,
	B_TO_C,
	C_TO_B,
	FIRST_STEP
}

public class Main {
	static public void main(String[] argv) {
		try{
//			FileReader file_in = new FileReader("test.txt");
//			BufferedReader d = new BufferedReader( file_in );
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
	
			while(true) {
				String buf = d.readLine();
				StringTokenizer st = new StringTokenizer(buf);
				int n = Integer.valueOf(st.nextToken());
				int m = Integer.valueOf(st.nextToken());
				if( n == 0 && m == 0 ) break;
				
				Cup cup_1 = new Cup(n, m);
				Cup cup_2 = new Cup(n, m);
				
				buf = d.readLine();
				cup_1.setTrayA(buf);
				cup_2.setTrayA(buf);
				
				buf = d.readLine();
				cup_1.setTrayB(buf);
				cup_2.setTrayB(buf);
				
				buf = d.readLine();
				cup_1.setTrayC(buf);
				cup_2.setTrayC(buf);
				
				if( cup_1.isEnd() ) {
					System.out.println(0);
					continue;
				}
				
				int op_type = cup_1.getOperationAvailable();
				OPERATION op_1, op_2;
				switch(op_type) {
					case 5:
						op_1 = OPERATION.B_TO_A;
						op_2 = OPERATION.C_TO_B;
						break;
					case 6:
						op_1 = OPERATION.A_TO_B;
						op_2 = OPERATION.C_TO_B;
						break;
					case 9:
						op_1 = OPERATION.B_TO_A;
						op_2 = OPERATION.B_TO_C;
						break;
					case 10:
						op_1 = OPERATION.A_TO_B;
						op_2 = OPERATION.B_TO_C;
						break;
					default:
						System.out.println("error: invalid op.");
						op_1 = OPERATION.A_TO_B;
						op_2 = OPERATION.A_TO_B;
						break;
				}
				
				cup_1.setPrevOp(op_1);
				cup_2.setPrevOp(op_2);
				

//				System.out.println( "=====solve1=====" );
				int ret_1 = cup_1.solve();
//				System.out.println( "=====solve2=====" );
				int ret_2 = cup_2.solve();
			
//				System.out.println( ret_1 + ", " + ret_2 );

				if( ret_1 < 0 && ret_2 < 0 ) {
					System.out.println(-1);
				} else if(ret_1 >= 0 && ret_2 < 0) {
					System.out.println(ret_1);
				} else if(ret_1 < 0 && ret_2 >= 0) {
					System.out.println(ret_2);
				} else {
					System.out.println( ret_1 < ret_2 ? ret_1 : ret_2 );
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Cup {
	private int _num;
	private int _max;
	private Stack<Integer> _tray_a;
	private Stack<Integer> _tray_b;
	private Stack<Integer> _tray_c;
	private OPERATION _prev_op;
	
	public Cup(int num, int max) {
		_num = num;
		_max = max;
		_tray_a = new Stack<Integer>();
		_tray_b = new Stack<Integer>();
		_tray_c = new Stack<Integer>();
		_prev_op = OPERATION.FIRST_STEP;
	}

	public void setPrevOp(OPERATION op) { _prev_op = op; }
	
	public boolean isEnd() {
		return _tray_a.size() == _num || _tray_c.size() == _num;
	}
	
	public void setTrayA(String str) {
		_tray_a = createTray(str);
	}
	public void setTrayB(String str) {
		_tray_b = createTray(str);
	}
	public void setTrayC(String str) {
		_tray_c = createTray(str);
	}
	
	private Stack<Integer> createTray(String str) {
		Stack<Integer> stack = new Stack<Integer>();
		StringTokenizer st = new StringTokenizer(str);
		int num = Integer.valueOf(st.nextToken());
		for(int i = 0; i < num; i++) {
			Integer e = new Integer(st.nextToken());
			stack.push( e );
		}
		return stack;
	}
	
	public void operate() {
		int top_a = ( _tray_a.empty() ) ? 0 : _tray_a.get( _tray_a.size()-1 );
		int top_b = ( _tray_b.empty() ) ? 0 : _tray_b.get( _tray_b.size()-1 );
		int top_c = ( _tray_c.empty() ) ? 0 : _tray_c.get( _tray_c.size()-1 );
		if( top_a > top_b && _prev_op != OPERATION.B_TO_A ) {
			_tray_b.push( _tray_a.pop() );
			_prev_op = OPERATION.A_TO_B;
		} else if( top_b > top_a && _prev_op != OPERATION.A_TO_B ) {
			_tray_a.push( _tray_b.pop() );
			_prev_op = OPERATION.B_TO_A;
		} else if( top_b > top_c && _prev_op != OPERATION.C_TO_B ) {
			_tray_c.push( _tray_b.pop() );
			_prev_op = OPERATION.B_TO_C;
		} else if( top_c > top_b && _prev_op != OPERATION.B_TO_C ) {
			_tray_b.push( _tray_c.pop() );
			_prev_op = OPERATION.C_TO_B;
		}
	}
	
	public int solve() {
		boolean isImpossible = true;
		int count;
//		printCup();
		for(count = 1; count <= _max; count++) {
			operate();
//			printCup();
			if(isEnd()) {
				isImpossible = false;
				break;
			}
		}
		if(isImpossible) {
			count = -1;
		}
		return count;
	}
	
	public int getOperationAvailable() {
		int ret = 0;
		int top_a = ( _tray_a.empty() ) ? 0 : _tray_a.get( _tray_a.size()-1 );
		int top_b = ( _tray_b.empty() ) ? 0 : _tray_b.get( _tray_b.size()-1 );
		int top_c = ( _tray_c.empty() ) ? 0 : _tray_c.get( _tray_c.size()-1 );
		if( top_a > top_b  ) {
			ret |= 1;
		} 
		if( top_b > top_a  ) {
			ret |= 1 << 1;
		} 
		if( top_b > top_c  ) {
			ret |= 1 << 2;
		} 
		if( top_c > top_b ) {
			ret |= 1 << 3;
		}
		return ret;
	}
	
	public void printCup() {
		System.out.print("A: ");
		for(int i = 0; i < _tray_a.size(); i++ ) {
			System.out.print(_tray_a.get(i) + " ");
		}
		System.out.println();
		System.out.print("B: ");
		for(int i = 0; i < _tray_b.size(); i++ ) {
			System.out.print(_tray_b.get(i) + " ");
		}
		System.out.println();
		System.out.print("C: ");
		for(int i = 0; i < _tray_c.size(); i++ ) {
			System.out.print(_tray_c.get(i) + " ");
		}
		System.out.println();
		System.out.println();
	}
}
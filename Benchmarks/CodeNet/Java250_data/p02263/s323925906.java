import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		ReversePolishNotation(scanner);
		
		scanner.close();
	}
	
	public static enum Operator
	{
		plus(43),
		times(42),
		minus(45);
		
		private final int mark;
		
		private Operator(final int mark) {
			this.mark = mark;
		}
		
		public int getInt(){
			return this.mark;
		}
	}
	public static Operator getMark(final int id) {
		Operator[] marks = Operator.values();
		for (Operator type : marks) {
			if (type.getInt() == id) {
				return type;
			}
		}
		return null;
	}

	public static void ReversePolishNotation(Scanner scanner ){ // N個の要素を含む0-オリジンの配列A
		String num;
		int sub;
		int array_num[] = new int[100];
		int count = 0;
		int count_num = 0;
		int i;
		byte[] oper = new byte[200];
		
		
		while( scanner.hasNext() ){
			num = scanner.next();
			try {
				oper = num.getBytes("US-ASCII");
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		
			sub = (int)oper[0];
			
			if(sub < 42 || sub > 45){
				array_num[count_num] = Integer.parseInt(num);
				count_num ++;
			
			}else{
				count_num -= 2;
				if( count_num >= 0 ){
					switch( getMark(sub) ) {
						case plus:
							array_num[count_num] = array_num[count_num] + array_num[count_num + 1];
							count_num ++;
							break;
						case times:
							array_num[count_num] = array_num[count_num] * array_num[count_num + 1];
							count_num ++;
							break;
						case minus:
							array_num[count_num] = array_num[count_num] - array_num[count_num + 1];
							count_num ++;
					}
				}else {
					break;
				}
			
			count ++;
			}
		
		}
		System.out.println(array_num[0]);
	}
}

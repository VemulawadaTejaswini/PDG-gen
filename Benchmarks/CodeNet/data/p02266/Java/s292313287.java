import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String mark = scanner.next();
		int num = mark.length();
		
		SectionDiagram(mark, num, scanner);
		
	}
	//enum宣言
	public static enum Operate{
		back(92),
		slush(47),
		under(95);
		
		private final int mark;
		
		private Operate(final int mark) {
			this.mark = mark;
		}
		
		public int getInt(){
			return this.mark;
		}
	}
	public static Operate getOperate(final int id) {
		Operate[] marks = Operate.values();
		for (Operate type : marks) {
			if (type.getInt() == id) {
				return type;
			}
		}
		return null;
	}
	//治水シミュレーション
	public static void SectionDiagram(String mark, int num, Scanner scanner){
		int count = 0;										//Whileの周回
		byte[] mark_num = new byte[num];					//switch用格納庫
		int sum_puddle = 0;
		
		Deque<Integer> downPos = new ArrayDeque<>();
		Deque<flood> downPosPool = new ArrayDeque<>();
		 
		//文字列変換
		try {
			mark_num = mark.getBytes("US-ASCII");
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		while( num > count ){										//文字数文処理
			switch( getOperate(mark_num[count]) ){					//文字により分岐
			case back:
				downPos.push(count);								//追加
				break;
			case slush:
				//頂上じゃなければ
				if ( !downPos.isEmpty()) {
					int slu = downPos.pop();							//スラッシュ追加
					int puddles = count - slu;
					sum_puddle += puddles;
					while (!downPosPool.isEmpty() && downPosPool.peek().rimit > slu) {
						puddles += downPosPool.pop().trout;
					}
					downPosPool.push(new flood(slu, puddles));
				}
				break;
			case under:
				break;
			}
			count ++;
		}
		//出力処理
        System.out.println(sum_puddle);
		int size = downPosPool.size();
        System.out.print(size);
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
            System.out.print(downPosPool.pollLast().trout);
        }
        System.out.println();
	}
	
	static class flood {
        int rimit;
        int trout;
        flood(int i1, int i2) {
            rimit = i1;
            trout = i2;
        }
    }
}

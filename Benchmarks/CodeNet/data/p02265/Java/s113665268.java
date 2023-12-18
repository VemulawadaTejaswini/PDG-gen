import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int ope = Integer.parseInt(br.readLine());
			DoublyLinkedList(ope, br);
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	public static enum Operate{
		insert("insert"),
		delete("delete"),
		deleteFirst("deleteFirst"),
		deleteLast("deleteLast");
		
		private final String name;
		
		Operate(String name){
			this.name = name;
		}
		
		String getName(){
			return this.name;
		}

		public static Operate getEnumName(String str){
			for(Operate v : values()){
				if(v.getName().equals(str)){
					return v;
				}
			}
			throw new IllegalArgumentException("undefined : " + str);
		}
	}

	public static void DoublyLinkedList(int ope, BufferedReader br){
		ArrayDeque<String> que = new ArrayDeque<String>();
		int i;
		
		for ( i = 0; i < ope; i++) {
			String[] str;
			try {
				str = br.readLine().split(" ");
			 
				switch( Operate.getEnumName(str[0]) ){
				case insert:
					que.addFirst(str[1]);
					break;
				case delete:
					que.remove(str[1]);
					break;
				case deleteFirst:
					que.removeFirst();
					break;
				case deleteLast:
					que.removeLast();
					break;
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		System.out.print(que.remove());
		while (que.isEmpty() == false) {
			System.out.print(" " + que.remove());
		}
		System.out.println();
	}
}

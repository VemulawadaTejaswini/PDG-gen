import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 0;
		String meirei;
		StringBuilder answer = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<Integer>();

		int i;
		int size;
		int size2;

		for(i = 0; i < n; i++){
			meirei = scan.next();

			if(meirei.equals("deleteFirst")){
				size = list.size();
				list.remove(size - 1);
			}else if(meirei.equals("deleteLast")){
					list.remove(0);
			}else if(meirei.equals("insert") || meirei.equals("delete")){
				m = scan.nextInt();
				if(meirei.equals("insert")){
					list.add(m);
				}else{
					int index = list.lastIndexOf(m);
					if(index > -1)
					{
						list.remove(index);
					}
//					size = list.size();
//					for(int j = size - 1; j >= 0; j--){
//						if(m == list.get(j)){
//							list.remove(j);
//							break;
//						}
//					}
				}
			}
		}

		size = list.size();
//		answer.append(String.valueOf(list.get(size - 1)));
//		for(i = size - 2; i >= 0; i--){
//			answer.append(" " + list.get(i));
//		}
//		System.out.println(answer);
		PrintWriter out = new PrintWriter(System.out);
		for(i = size - 1; i >= 0; i--)
		{
			System.out.print(list.get(i));
			if(i != 0)
			{
				out.print(" ");
			}else{
				out.println();
			}
		}
	}
}
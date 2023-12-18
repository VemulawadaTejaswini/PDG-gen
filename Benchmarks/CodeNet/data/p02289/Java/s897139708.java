import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
class Main {
  	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> Dic = new LinkedList<Integer>();
		String end = "end";
		int max = 0;
		int c = 0;
		
		for(;;){
			String meirei = scan.next();
			if(meirei.equals(end)) break;
			
			if(meirei.equals("insert")){
				int n = scan.nextInt();
				Dic.add(n);
			}else{
				for(int i = 0; i < Dic.size(); i++){
					if(max < Dic.get(i)){
						max = Dic.get(i);
						c = i;
					}
				}
				
				System.out.println(Dic.remove(c));
				max = 0;
			}
		}
	}
}
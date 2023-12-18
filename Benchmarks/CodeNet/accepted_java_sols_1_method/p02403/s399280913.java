import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<>();
		while(true){
			list.add(sc.nextLine());
			if(list.getLast().equals("0 0")){
				break;
			}
		}
		list.removeLast();
		for(String data: list){
			int H = Integer.parseInt(data.split(" ")[0]);
			int W = Integer.parseInt(data.split(" ")[1]);
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					System.out.print("#");
				}
				System.out.printf("\n");
			}
			System.out.println();
		}
	}
}



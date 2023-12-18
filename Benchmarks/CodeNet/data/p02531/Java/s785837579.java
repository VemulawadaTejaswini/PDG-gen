import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<String> blocksStacking = new ArrayList<String>();
	private static ArrayList<String> blocksRemoved = new ArrayList<String>();
	
	public static void main(String[] args) {
		while(sc.hasNext()){
			if(manipulation(sc.next())){
				//³íÉìªsíêÄ¢éÈçA½àµÈ¢
			}
			else{
				break;
			}
		}
		
		for(int i = 0; i < blocksRemoved.size(); i++){
			System.out.println(blocksRemoved.get(i));
		}
	}
	
	public static boolean manipulation(String input){
		if(input.compareTo("push") == 0){
			String block = sc.next();
			blocksStacking.add(block);
			return true;
		}
		else if(input.compareTo("pop") == 0){
			int lastIndex = blocksStacking.size() - 1;
			String block = blocksStacking.get(lastIndex);
			blocksStacking.remove(lastIndex);
			blocksRemoved.add(block);
			return true;
		}
		else if(input.compareTo("quit") == 0){
			return false;
		}
		else{
			return true;
		}
	}
}
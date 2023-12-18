import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Deque<Integer> list = new ArrayDeque<Integer>();
		Scanner scan = new Scanner(System.in);
		int decAmount = scan.nextInt();
		int totalTime = 0;
		int[] number = new int[decAmount];	
		int check =0;
		String[] decree = new String[decAmount];
		

		for(int i=0; i<decAmount; i++){
			decree[i] = scan.next();
			if(decree[i].equals("insert") || decree[i].equals("delete")){
				number[i] = scan.nextInt();
			}
			///??????????????????
			if(decree[i].equals("insert")){
				list.addFirst(number[i]);
			}
			if(decree[i].equals("delete")){
				
//				check = list.indexOf(number[i]);
//				System.out.println(check);
//				if(check != -1){
					list.removeFirstOccurrence(number[i]);
//				}
			}
			if(decree[i].equals("deleteFirst")){
				list.removeFirst();
			}
			if(decree[i].equals("deleteLast")){
				list.removeLast();
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.print(list.poll());
			if(i == list.size()-1){
				System.out.println("");
			}
			else{
				System.out.print(" ");
			}
		}
	}
}
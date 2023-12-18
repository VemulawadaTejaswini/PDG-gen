import java.util.Scanner;
import java.util.ArrayDeque;
public class Main{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		
		int n=scan.nextInt();
		int key;
		String command;
		for(int i=0;i<n;i++){
			command=scan.next();
			if(command.equals("insert")){
				key=scan.nextInt();
				ad.addFirst(key);
			}else if(command.equals("delete")){
				key=scan.nextInt();
				ad.removeFirstOccurrence(key);
			}else if(command.equals("deleteFirst")){
				ad.removeFirst();
			}else{
				ad.removeLast();
			}
		}
		key=0;
		while(!ad.isEmpty()){
			if(key==0){
				System.out.print(ad.pollFirst());
				key++;
			}else{
				System.out.print(" "+ad.pollFirst());
			}
		}
		System.out.println();
		scan.close();
	}

}
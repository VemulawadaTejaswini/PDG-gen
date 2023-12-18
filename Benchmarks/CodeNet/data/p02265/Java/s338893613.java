import java.util.Scanner;
import java.util.ArrayDeque;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>(2000000);
		
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			if(scan.next().equals("insert")){
				ad.addFirst(scan.nextInt());
			}else if(scan.next().equals("delete")){
				ad.removeFirstOccurrence(scan.nextInt());
			}else if(scan.next().equals("deleteFirst")){
				ad.removeFirst();
			}else if(scan.next().equals("deleteLast")){
				ad.removeLast();
			}
		}
		n=0;
		while(!ad.isEmpty()){
			if(n==0){
				System.out.print(ad.pollFirst());
				n++;
			}else{
				System.out.print(" "+ad.pollFirst());
			}
		}
		System.out.println();
		scan.close();
	}

}
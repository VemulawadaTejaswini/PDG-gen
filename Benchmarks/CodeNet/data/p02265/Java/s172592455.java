import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Deque<Integer> list = new ArrayDeque<Integer>();
//		Scanner scan = new Scanner(System.in);
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int decAmount = Integer.parseInt(scan.readLine());
		int totalTime = 0;
		int[] number = new int[decAmount];
		int check =0;
		String[] decree = new String[decAmount];


		for(int i=0; i<decAmount; i++){
			decree[i] = scan.readLine();
			String[] gyou = decree[i].split(" ");
			///??????????????????
			if(gyou[0].equals("insert")){
//				System.out.println("add "+gyou[1]);
				list.offerFirst(Integer.parseInt(gyou[1]));
			}
			if(gyou[0].equals("delete")){
//				System.out.println("remove "+gyou[1]);
				list.removeFirstOccurrence(Integer.parseInt(gyou[1]));
			}
			if(gyou[0].equals("deleteFirst")){
				list.removeFirst();
			}
			if(gyou[0].equals("deleteLast")){
				list.removeLast();
			}
		}
		int times= list.size();
		for(int i=0;i<times;i++){
			System.out.print(list.poll());
			if(i == times-1){
				System.out.println("");
			}
			else{
				System.out.print(" ");
			}
		}
	}
}
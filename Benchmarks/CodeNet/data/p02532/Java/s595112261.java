import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;


public class Main{
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner (new InputStreamReader(System.in));
			int n =scan.nextInt();
			LinkedList<String>[] list = new LinkedList[n];
			for(int i = 0;i < list.length;i++){
				list[i] = new LinkedList<String>();
			}
			while(scan.hasNext()){
				String[] str = scan.nextLine().split(" ");
				if(str[0].equals("quit")){
					break;
				}else if(str[0].equals("push")){
					int d = Integer.parseInt(str[1]) -1;
					list[d].push(str[2]);
				}else if (str[0].equals("pop")){
					int d = Integer.parseInt(str[1]) -1;
					System.out.println(list[d].pop());
				}else if(str[0].equals("move")){
					int i = Integer.parseInt(str[1])-1;
					int j = Integer.parseInt(str[2])-1;
					list[j].push(list[i].pop());
				}
			}
		}finally{
			scan.close();
		}
	}
}
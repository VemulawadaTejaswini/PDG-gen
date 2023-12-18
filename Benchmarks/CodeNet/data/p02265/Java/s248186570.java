
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//sc.nextLine();
		for(int i=1;i<=n;i++){
			String s = sc.next();
			
			if(s.equals("insert")){
				int num = sc.nextInt();
				list.addFirst(num);
			}
			else if(s.equals("delete")){
				int num = sc.nextInt();
				for(int j=0;j<list.size();j++){
					if(list.get(j)==num)
						list.remove(j);
				}
			}
			else if(s.equals("deleteFirst")){
				list.remove(0);
			}
			else if(s.equals("deleteLast")){
				list.remove(list.size()-1);
			}
			/*String str = sc.nextLine();
			String[] s = str.split(" ");
			
			if(s.length!=1){
				String r = s[0];
				int num = Integer.parseInt(s[1]);
				if(r.equals("insert")){
					list.addFirst(num);
				}
				else{
					for(int j=0;j<list.size();j++){
						if(list.get(j)==num)
							list.remove(j);
					}
				}
			}
			else{
				if(s[0].equals("deleteFirst")){
					//list.remove(0);
					list.pollFirst();
				}
				else{
					//list.remove(list.size()-1);
					list.pollLast();
				}
			}*/
		}
		
		for(int i=0;i<list.size();i++){
			if(i!=list.size()-1)
				System.out.print(list.get(i)+" ");
			else
				System.out.print(list.get(i));
		}
		System.out.println();
	}
}

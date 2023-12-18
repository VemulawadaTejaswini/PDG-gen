import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String answer ="";
			LinkedList<String> lt = new LinkedList<String>();
			int rundex = Integer.parseInt(cin.nextLine());
			for (int i = 1; i <= rundex; i++) {
				String[] str = cin.nextLine().split(" ");
				switch (str[0]) {
				case "insert":
					lt.add(str[1]);
					break;
				case "delete":
					if(lt.contains(str[1]))
					{
						for(int index =0;index<lt.size();index++)
						{
							if(lt.get(index).equals(str[1])){lt.remove(index);break;}
						}
					}
					break;
				case "deleteFirst":
					lt.removeLast();
					break;
				case "deleteLast":
					lt.removeFirst();
					break;
				}
				
			}
			for(int index=lt.size()-1;index>=0;index--){
				if(index==0)answer += lt.get(index);
				else answer += lt.get(index)+" ";
			}
			System.out.println(answer);
		}

	}

}


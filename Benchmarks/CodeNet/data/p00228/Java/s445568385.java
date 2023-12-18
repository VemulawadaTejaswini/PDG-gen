import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0228();
	}
	
	class AOJ0228{
		boolean[] number;
		ArrayList<boolean[]> list;
		
		void doIt(){
			int input = in.nextInt();
			String result = "";
			for(int i=0;i<7;i++){
				if(list.get(input)[i]&&!number[i])result+="1";
				else if(!list.get(input)[i]&&number[i])result+="1";
				else result+="0";
			}
			number = list.get(input);
			System.out.println(result);
		}
		
		public AOJ0228() {
			list = new ArrayList<boolean[]>();
			boolean[] a_0 = {false,true,true,true,true,true,true};list.add(a_0);
			boolean[] a_1 = {false,false,false,false,true,true,false};list.add(a_1);
			boolean[] a_2 = {true,false,true,true,false,true,true};list.add(a_2);
			boolean[] a_3 = {true,false,false,true,true,true,true};list.add(a_3);
			boolean[] a_4 = {true,true,false,false,true,true,false};list.add(a_4);
			boolean[] a_5 = {true,true,false,true,true,false,true};list.add(a_5);
			boolean[] a_6 = {true,true,true,true,true,false,true};list.add(a_6);
			boolean[] a_7 = {false,true,false,false,true,true,true};list.add(a_7);
			boolean[] a_8 = {true,true,true,true,true,true,true};list.add(a_8);
			boolean[] a_9 = {true,true,false,true,true,true,true};list.add(a_9);
			while(true){
				int n = in.nextInt();
				if(n==-1)break;
				number = new boolean[7];//gfedcba
				for(int i=0;i<n;i++)doIt();
			}
		}
	}
	
}
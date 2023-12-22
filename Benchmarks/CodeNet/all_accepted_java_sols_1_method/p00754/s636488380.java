import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String line = sc.nextLine();
			if(line.equals(".")==true) break;
			String[] line2 = line.split("");
			Queue<String> queue = new LinkedList<String>();
			Stack<String> stack = new Stack<String>();
			for(int i=0;i<line2.length;++i){
				if(line2[i].matches("[()\\[\\]]")==true){
					queue.add(line2[i]);
				}
			}
			boolean flag=true;
			int[] flag2=new int[2];
			int flag3=0;
			while(true){
				if(queue.isEmpty() || flag==false) break;
				String cur = queue.remove();
				if(cur.equals("(")){ flag2[0]++; flag3=1; stack.add(cur);}
				if(cur.equals("[")){ flag2[1]++; flag3=2; stack.add(cur);}
				if(cur.equals(")")){
					if(flag3==1&&1<=flag2[0]){
						flag2[0]--;
						 stack.pop();
						if(!stack.isEmpty()&&stack.peek().equals("[")==true) flag3=2;
					}
					else flag=false;
				}
				if(cur.equals("]")){
					if(flag3==2&&1<=flag2[1]){
						flag2[1]--;
						stack.pop();
						if(!stack.isEmpty()&&stack.peek().equals("(")==true) flag3=1;
					}
					else flag=false;
				}
			}
			if((flag2[0]==0&&flag2[1]==0)&&flag==true) System.out.println("yes");
			else System.out.println("no");
		}
	}
}


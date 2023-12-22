import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			String str=sc.next();
			if(str.equals("-")){
				break;
			}else{
				char[] ar = str.toCharArray();
				Queue<Character> q = new LinkedList<Character>();
				for(char ch:ar){
					q.offer(ch);
				}
				int m=sc.nextInt();
				for(int i=0;i<m;i++){
					int h=sc.nextInt();
					for(int j=0;j<h;j++){
						char ch=q.poll();
						q.offer(ch);
					}
				}
				while(q.size()>0){
					System.out.print(q.poll());
				}
				System.out.println();
			}
		}
	}
}
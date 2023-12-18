import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int top=sc.nextInt();
		int front=sc.nextInt();
		int right=sc.nextInt();
		int left=sc.nextInt();
		int back=sc.nextInt();
		int bottom=sc.nextInt();

		String line=sc.next();

		int tmp;
		for(int i=0;i<line.length();i++){
			String order=line.substring(i,i+1);
			if(order.equals("E")){
				tmp=top;
				top=left;
				left=bottom;
				bottom=right;
				right=tmp;
			}else if(order.equals("N")){
				tmp=top;
				top=front;
				front=bottom;
				bottom=back;
				back=tmp;
			}else if(order.equals("S")){
				tmp=top;
				top=back;
				back=bottom;
				bottom=front;
				front=tmp;
			}else if(order.equals("W")){
				tmp=top;
				top=right;
				right=bottom;
				bottom=left;
				left=tmp;
			}
		}

		System.out.println(top);

	}
}

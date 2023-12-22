import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a="0";
		IntStack iStack=new IntStack();
		while(sc.hasNext()){
			String str=sc.next();
			if(str.equals("+")){
				int x=iStack.pop();
				int y=iStack.pop();
				iStack.push(x+y);
				//System.out.println(x+"+"+y);
			}else if(str.equals("-")){
				int x=iStack.pop();
				int y=iStack.pop();
				iStack.push(y-x);				
				//System.out.println(x+"-"+y);
			}else if(str.equals("*")){
				int x=iStack.pop();
				int y=iStack.pop();
				iStack.push(x*y);
				//System.out.println(x+"*"+y);
			}else{
				int m=0;
				int n=1;
				for(int i=str.length()-1;i>=0;i--){
					m+=n*(str.charAt(i)-a.charAt(0));
					n=10*n;
				}
				iStack.push(m);
			}
		}
		System.out.println(iStack.pop());
	}
}

class IntStack{
	private int[] data=new int[256];
	private int sp=0;
	public int pop(){
		sp--;
		return data[sp];
	}
	public void push(int value){
		data[sp]=value;
		sp++;
	}
}
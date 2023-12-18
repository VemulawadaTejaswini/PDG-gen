import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st=new Stack();
		String t=sc.nextLine();
		String[] tt=t.split(" ");
		for(int i=0; i<tt.length; i++){
			String l=tt[i];

			if(l.equals("+")){
				int a=st.pop();
				int b=st.pop();

				st.push(a+b);

			}else if(l.equals("*")){
				int a=st.pop();
				int b=st.pop();
				st.push(a*b);
			}else if(l.equals("-")){
				int a=st.pop();
				int b=st.pop();
				st.push(b-a);
			}else{
				int a=Integer.parseInt(l);
				st.push(a);

			}




		}

		st.print();


	}

}

	class Stack{
		public int[] s=new int[1000];
		public int top=0;
		public void print(){
			System.out.println(s[top]);
		}
		public Boolean isEmpty(){
			return top==0;
		}
		public Boolean isFull(){
			return top==0;
		}
		public void push(int x){
			top++;
			s[top]=x;
		}
		public int pop(){
			top--;
			return s[top+1];

		}

	}

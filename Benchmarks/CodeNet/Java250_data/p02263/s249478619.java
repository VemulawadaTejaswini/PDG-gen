import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{




	public static void main(String[] args){

		int len;
		String array[];

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
		String str=reader.readLine();
		array=str.split(" ");

		len=array.length;

		Stack stack=new Stack(len);
		int tmp;

		for(int i=0;i<len;i++){
			switch(array[i]){
			case"+":
				tmp=stack.pop()+stack.pop();
				stack.push(tmp);
				break;
			case"-":
				tmp=stack.pop()-stack.pop();
				stack.push(-tmp);
				break;
			case"*":
				tmp=stack.pop()*stack.pop();
				stack.push(tmp);
				break;
			default:
				tmp=Integer.parseInt(array[i]);
				stack.push(tmp);
			}//swicth

		}//for

		System.out.println(stack.pop());



		}catch(IOException e){

		}

	}//main
}

class Stack{
	int max;
	int ptr;
	int[] array;

	Stack(int capacity){//?????????????????????
		max=capacity;
		ptr=0;
		array=new int[max];
	}

	public void push(int p){
		if(ptr<=max)array[ptr++]=p;
	}//push????????????

	public int pop(){
		if(ptr>0)return array[--ptr];
		else return -1;
	}//pop????????????

}//stack?????????
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		stack s = new stack();
		while(true){
			str = br.readLine();
			int n = Integer.parseInt(str);
			if(n != 0)
				s.push(n);
			else{
				int pop = s.pop();
				if(s.isEmpty()){
					System.out.println(pop);					
					break;
				}
				System.out.println(pop);
			}
			
		}

	}

}
class stack{
	int[] st = new int[100];
	int count = 0; // ツ債。ツつ「ツつュツづつ禿シツづづつ「ツづゥツつゥ
	
	int pop(){
		return st[--count];
	}
	void push(int n){
		st[count++] = n;
	}
	boolean isEmpty(){
		if(count < 1)
			return true;
		else
			return false;
	}
	
}
import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.next());
		int b = Integer.parseInt(s.next());
		int c = Integer.parseInt(s.next());
		int count=0;
		for(int i = a ; i <= b ; i++){
			if(c%i==0)count++;
		}
		System.out.println(count);
	}
}
			
			

import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String judge=sc.next();
		while(true){
			String temp=sc.next();
			if(temp.equals("END_OF_TEXT"))break;
			else if(temp.equals(judge)){
				count++;
			}
		}
		System.out.println(count);
	}
}
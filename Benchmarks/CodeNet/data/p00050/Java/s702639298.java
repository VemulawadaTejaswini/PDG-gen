import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner (System.in);
		while(true){
			String now=s.next();
			if(now.length()<5)System.out.print(now);
			else if(now.substring(0,5).equals("apple"))System.out.print("peach"+now.substring(5));
			else if(now.substring(0,5).equals("peach"))System.out.print("apple"+now.substring(5));
			else System.out.print(now);
			if(s.hasNext()){
				System.out.print(" ");
			}else{
				System.out.println();
				break;
			}
		}
	}
}
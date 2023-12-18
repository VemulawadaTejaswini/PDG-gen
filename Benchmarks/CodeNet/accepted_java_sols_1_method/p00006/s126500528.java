import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(new StringBuffer(sc.next()).reverse().toString());
		}
	}
}
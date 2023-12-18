import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(Integer.toString(sc.nextInt() + sc.nextInt()).length());
		}
	}
}
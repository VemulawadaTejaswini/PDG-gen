import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();

		while(sc.hasNextInt()){
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			if(x==0 && y==0){
				break;
			}
			
			if(y<x){
				int tmp=x;
				x=y;
				y=tmp;
			}
			a.add(x + " " + y);
		}

		for(int i = 0; i < a.size(); i++){
			System.out.println(a.get(i));
		}
	}
}

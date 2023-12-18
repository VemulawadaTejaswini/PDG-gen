import java.io.*;
import java.util.*;


public class Main{

	public static void main(String args[]){
		ArrayList<Swap> list = new ArrayList<Swap>();
		Scanner scan = new Scanner(System.in);
		while(true){
			int x =  scan.nextInt();
			int y =  scan.nextInt();
			if(x==0 && y==0)
				break;
			list.add(new Swap(x,y));
		}
		scan.close();
		for(Swap s : list){
			s.smaller();
			System.out.println(s);
		}
		

	}

}

class Swap{
	int a;
	int b;
	public Swap(int x, int y){
		a = x;
		b = y;	
	}
	
	public void smaller(){
		if(a < b)
			return;
		int tmp = a;
		a=b;
		b=tmp;
	}

	@Override
	public String toString(){
		return a + " " + b;
	}

}
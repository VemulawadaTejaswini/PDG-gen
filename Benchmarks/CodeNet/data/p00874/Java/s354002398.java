import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int w, d;

	void run(){
		for(;;){
			w=sc.nextInt();
			d=sc.nextInt();
			if((w|d)==0){
				break;
			}
			LinkedList<Integer> a=new LinkedList<Integer>();
			LinkedList<Integer> b=new LinkedList<Integer>();
			for(int i=0; i<w; i++){
				a.add(sc.nextInt());
			}
			for(int i=0; i<d; i++){
				b.add(sc.nextInt());
			}
			for(int e : a){
				if(b.contains(e)){
					b.remove((Integer)e);
				}
			}
			int ans=0;
			for(int e : a){
				ans+=e;
			}
			for(int e : b){
				ans+=e;
			}
			println(""+ans);
		}
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();

	}
}
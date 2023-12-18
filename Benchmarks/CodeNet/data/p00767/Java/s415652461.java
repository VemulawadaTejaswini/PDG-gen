import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] __){
		TreeSet<Rect> ts=new TreeSet<>(
					Comparator.comparingInt(Rect::getDiagSq).thenComparingInt(Rect::getH)
				);
		for(int i=1;i<=150;i++) for(int j=i+1;j<=150;j++) ts.add(new Rect(i,j));
		while(true){
			int h=s.nextInt(),w=s.nextInt();
			if(h+w==0) return;
			System.out.println(ts.higher(new Rect(h,w)));
		}
	}
}
class Rect{
	int h,w;
	Rect(int h,int w){
		this.h=h;
		this.w=w;
	}
	int getDiagSq(){
		return h*h+w*w;
	}
	int getH(){
		return h;
	}
	@Override
	public String toString(){
		return h+" "+w;
	}
}
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static HashMap<String,Integer> m = new HashMap<String,Integer>();
	static Dice[] d ;
	static{
		m.put("Cyan", 0);
		m.put("Yellow", 1);
		m.put("Red", 2);
		m.put("Magenta", 3);
		m.put("Green", 4);
		m.put("Blue", 5);
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==0){
				break;
			}
			d = new Dice[N];
			for(int i =0;i<N;i++){
				int[] a = new int[6];
				for(int j = 0;j<6;j++){
					a[i]=m.get(cin.next());
				}
				d[i]=new Dice(a[0],a[1],a[2],a[3],a[4],a[5]);
			}
			int count=0;
			for(int i = 0;i<N;i++){
				int j=0;
				for(j = i+1;j<N;j++){
					if(sameTop(i,j)){
						break;
					}
					d[j].roll();
					if(sameTop(i,j)){
						break;
					}
					d[j].roll();
					if(sameTop(i,j)){
						break;
					}
					d[j].roll();
					if(sameTop(i,j)){
						break;
					}
					d[j].roll();
					d[j].turn();
					if(sameTop(i,j)){
						break;
					}
					d[j].roll();
					d[j].roll();
					if(sameTop(i,j)){
						break;
					}
				}
				if(j==N){
					count++;
				}
			}
			System.out.println(N-count);
		}
	}
	static boolean sameTop(int i,int j){
		for(int k=0;k<4;k++){
			if(d[i].same(d[j])){
				return true;
			}
			d[i].turn();
		}		
		return false;
	}
}
class Dice{
	int top;
	int a;
	int b;
	int c;
	int d;
	int bottom;
	Dice(int x,int y,int z,int w,int i,int j){
		top=x;
		a=y;
		b=z;
		c=w;
		d=i;
		bottom=j;
	}
	boolean same(Dice d){
		if(this.top==d.top&&this.a==d.a&&this.b==d.b
				&&this.c==d.c&&this.d==d.d&&this.bottom==d.bottom){
			return true;
		}
		return false;
	}
	public void updown(){
		int tmp = top;
		top = bottom;
		bottom = tmp;
	}
	void roll(){
		int tmp = top;
		top = c;
		c = bottom;
		bottom=a;
		a = tmp;
	}
	void turn(){
		int tmp=a;
		a=b;
		b=c;
		c=d;
		d=tmp;
	}
}
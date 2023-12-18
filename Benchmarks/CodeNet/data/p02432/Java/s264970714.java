import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			for(int i=0;i<a;i++){
				int b=scan.nextInt();
				if(b==0){
					int c=scan.nextInt();
					int d=scan.nextInt();
					kadai.push(c,d);
				}else if(b==1){
					int c=scan.nextInt();
					int ab=kadai.randomAccess(c);
					System.out.println(ab);
				}else if(b==2){
					int c=scan.nextInt();
					kadai.pop(c);
				}
			}
		scan.close();
	}
}

class kadai{
	static ArrayList<Integer> retu=new ArrayList<>();
	
	static void pushBack(int a){
	retu.add(a);
	}
	static int randomAccess(int a){
		int d=0;
		d=retu.get(a);
		return d;
	}
	static void popBack(){
		int d=0;
		d=retu.size();
		retu.remove(d-1);
	}
	static void push(int a,int b){
		if(a==0){
		retu.add(0,b);
		}else if(a==1){
			retu.add(b);
		}
	}
	static void pop(int a){
		retu.remove(a);
	}
}

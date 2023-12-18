import java.util.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			for(int i=0;i<a;i++){
				int b=scan.nextInt();
				if(b==0){
					int c=scan.nextInt();
					kadai.pushBack(c);
				}else if(b==1){
					int c=scan.nextInt();
					kadai.randomAccess(c);
				}else if(b==2){
					kadai.popBack();
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
		int b=0;
		b=retu.get(a);
		return b;
	}
	static void popBack(){
		int b=0;
		b=retu.size();
		retu.remove(b);
	}
}

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int ans=0;
		int a=scan.nextInt();
		for(int i=0;i<a;i++){
			int s=scan.nextInt();
			if(s==0){
				int b=scan.nextInt();
				Sort.pushBack(b);
			}else if(s==1){
				int c=scan.nextInt();
				ans=Sort.randomAccess(c);
			}else if(s==2){
				Sort.popBack();
			}
			System.out.println(ans);
		}
		scan.close();
	}
}

class Sort{
	static ArrayList<Integer> hai=new ArrayList<Integer>();
	static int i=0;
	static void pushBack(int a1){
		hai.add(new Integer(a1));
		i++;
	}
	static int randomAccess(int a2){
		int kotae=hai.get(a2);
		return kotae;
	}
	static void popBack(){
		hai.remove(i);
	}
}


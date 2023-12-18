import java.util.*;

public class Main {

	static int linearsearch(int[] a, int key){
		for(int i=0; i<a.length; i++)
			if(a[i] == key) return i;
		return -1;		
	}
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		int[] b = new int[4];
		
		while(sc.hasNext()){
			for(int i=0; i<4; i++) a[i] = sc.nextInt();
			for(int i=0; i<4; i++) b[i] = sc.nextInt();
			int hit = 0;
			int blow = 0;
			
			for(int i=0; i<4; i++){
				if(i == linearsearch(a,b[i])) blow++;
				else if(linearsearch(a,b[i]) != -1) hit++;
			}
		
			System.out.print(blow +" "+ hit +"\n");
		}
		

	}

}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		ArrayList<String> ary = new ArrayList<String>();
		int x,y;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
//		sc.useDelimiter("\\r\\n");

		x = sc.nextInt();
		y = sc.nextInt();
		ary.add(ArrayAdder(x,y));
		cnt++;

		while(x!=0 || y!=0){
			sc.hasNext();
			x = sc.nextInt();
			y = sc.nextInt();
			ary.add(ArrayAdder(x,y));
			cnt++;
		}

		for(int i=0;i<cnt-1;i++){
			System.out.println(ary.get(i));
		}
		sc.close();
	}

	public static String ArrayAdder(int x,int y){
		String str;
		if(x > y){
			str = y +" "+ x;
		}else{
			str = x +" "+ y;
		}
		return str;
	}

}
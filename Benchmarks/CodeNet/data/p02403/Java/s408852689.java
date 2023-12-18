import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		ArrayList<String> ary = new ArrayList<String>();
		int x,y;
		String tmp;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();
		tmp = ArrayAdder(x,y);
		ary.add(tmp);
		cnt++;

		while(!tmp.equals("end")){
			sc.hasNext();
			x = sc.nextInt();
			y = sc.nextInt();
			tmp = ArrayAdder(x,y);
			ary.add(tmp);
			cnt++;
		}

		for(int i=0;i<cnt-1;i++){
			System.out.println(ary.get(i));
			if(i>cnt-1){
				System.out.println();
			}
		}
		sc.close();
	}

	public static String ArrayAdder(int x,int y){
		String result = "";
		if(x==0 && y==0){
			return "end";
		}

		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				result = result + "#";
			}
			result = result + "\r\n";
		}

		return result;
	}

}
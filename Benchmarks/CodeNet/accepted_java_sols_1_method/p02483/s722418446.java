import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0 ; i < 3;i++){
				list.add(scan.nextInt());
			}
			for(int i = 2; i >=0;i--){
				for(int j = i-1; j >=0;j--){
					if(list.get(i) < list.get(j)){
						int tmp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, tmp);
					}
				}
			}
			System.out.printf("%d %d %d\n",list.get(0),list.get(1),list.get(2));
		}finally{
			scan.close();
		}
	}
}
import java.util.*;
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		while(true){
			int N = in.nextInt();
			int P = in.nextInt();
			if(N == P && N == -1)break;
			List<Integer> list = new ArrayList<Integer>();
			N++;
			while(list.size() < 100){
				boolean flg = true;
				if(N == 1)flg = false;
				for(int k = 2; k * k <= N; k++){
					if(N % k == 0){
						flg = false;
						break;
					}
				}
				if(flg)list.add(N);
				N++;
			}
			//		for(int i = 0; i < list.size(); i++){
			//			System.out.println(list.get(i));
			//		}
			List<Integer> array = new ArrayList<Integer>();
			for(int i = 0; i < list.size(); i++){
				for(int k = 0; k <= i; k++){
					array.add(list.get(i) + list.get(k));
				}
			}
			Collections.sort(array);
			//		for(int i = 0; i < array.size(); i++){
			//			System.out.println(array.get(i));
			//		}
			System.out.println(array.get(P - 1));
		}
	}
}
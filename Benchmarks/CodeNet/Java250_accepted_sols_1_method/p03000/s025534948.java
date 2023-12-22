import java.util.*;
public class Main {
 
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int N = sc.nextInt();
			int X = sc.nextInt();
			ArrayList<Integer> L = new ArrayList<Integer>();
			for(int i=0 ; i<N ; i++){
				L.add(sc.nextInt());
			}
			int count = 1;
			int distance = 0;
			for(int i=0 ; i<N ; i++){
				distance += L.get(i);
				if(distance<=X){
					count+=1;
				}else break;
			}
			System.out.println(count);
		}
 
	}
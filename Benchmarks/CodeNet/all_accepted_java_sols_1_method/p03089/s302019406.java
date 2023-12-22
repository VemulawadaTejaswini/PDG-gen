
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

//		int b[] = new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
//		int diff[] = new int[n];
		for(int i = 0; i < n; i++){
//			b[i] = sc.nextInt();
			list.add(sc.nextInt());

//			System.out.println("I = "+i+" "+list.get(i));
			if(list.get(i) > i + 1){
//				System.out.println(list.get(i));
				System.out.println(-1);
				return;
			}
//
//			diff[i] = (i + 1) - list.get(i);
		}

		int result[] = new int[n];
		for(int i = 0; i < n; i++){
			for(int j = list.size() - 1; j >= 0; j--){
				if(list.get(j) == j + 1){
//					System.out.println("remove "+(j + 1));
					result[i] = j + 1;
					list.remove(j);
					break;
				}
//				if(diff[j] == 0){
//					result[i] = b[j];
//
//					for(int k = j + 1; k < n; k++){
//						diff[k]--;
//					}
//
//					break;
//				}
			}

			//debug
//			for(int j = 0; j < list.size(); j++){
//				System.out.print(list.get(j)+" ");
//			}
//			System.out.println();
		}

		for(int i = n - 1; i >= 0; i--){
			System.out.println(result[i]);
		}
	}
}

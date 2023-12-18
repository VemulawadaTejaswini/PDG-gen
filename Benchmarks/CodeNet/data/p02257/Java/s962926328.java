import java.util.*;

class Main {
	public static void main(String args[]){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			ar.add(sc.nextInt());
		}
		int size = ar.size() - 1;
		for(int i = 0;i <= size;i++){
			int num = ar.get(i);
			//for(int j = 2;j < num;j+=10){
				double d = Math.floor(num / 2);
				if(num == 2 || num == 3){
					cnt++;
					//break;
				//}else if(num % j == 0){
				//	break;
				}else if(num % d != 0){
					if(num % 3 != 0){
						cnt++;
						d = 0;
					}
				}
			//}
		}
		System.out.println(cnt);
	}
}
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
			if(num == 2){
				cnt++;
			}
			for(int j = 2;j < num;j+=10){
				if(num % j == 0,num % (j+1) == 0,num % (j+2) == 0,num % (j+3) == 0,num % (j+4) == 0,num % (j+5) == 0,num % (j+6) == 0,num % (j+7) == 0,num % (j+8) == 0,num % (j+9) == 0,num % (j+10) == 0,){
					break;
				}else if(num - j == 1){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
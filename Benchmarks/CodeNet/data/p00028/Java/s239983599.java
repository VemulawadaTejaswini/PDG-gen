import java.util.*;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int [] count = new int[101];
		while(sc.hasNext()){
			count[sc.nextInt()]++;
		}
		int max = 0;
		for(int i=0; i < 101; i++){
			max = Math.max(count[i], max);
		}
		for(int i=0; i < 101; i++){
			if(count[i] == max){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main app = new Main();
		boolean map[] = new boolean[1001];
		
		for(int i = 2; i < 101; i++){
			if(!app.judge(i)){
				map[i] = true;
				
			}
			
		}
		
		con:for(int i = 2; i <= 100; i++){
			if(map[i] == false){

				for(int j = 2; j < 1001; j++){
				
					if(i * j > 1000)continue con;
					else{
						map[i*j] = true;
					}
				}
			}
		}
		int count = 0;
		int n = sc.nextInt();
		for(int i = 0; i <n; i++){
			//System.out.println(map[sc.nextInt()]);
			if(!map[sc.nextInt()]){
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	boolean judge(int temp){
		if(temp == 2)return true;
		else if(temp == 1)return false;
		else {
			for(int i = 2; i < temp; i++){
				if(temp%i == 0)return false;

			}
			return true;
		}
		
			
	}

}
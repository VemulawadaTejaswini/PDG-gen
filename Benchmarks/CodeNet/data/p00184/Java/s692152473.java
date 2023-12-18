import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, read_value;
	static int[] generation;;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)
			return false;
		generation = new int[7];
		for(int i = 0; i < n; i++){
			read_value = sc.nextInt();
			if(read_value < 10){
				generation[0]++;
			}else if(read_value < 20){
				generation[1]++;
			}else if(read_value < 30){
				generation[2]++;
			}else if(read_value < 40){
				generation[3]++;
			}else if(read_value < 50){
				generation[4]++;
			}else if(read_value < 60){
				generation[5]++;
			}else{
				generation[6]++;
			}
		}
		return true;
	}
	static void solve(){
		for(int i = 0; i < 7; i++)
			System.out.println(generation[i]);
	}
}
import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] data;
	static int n, index_number;
	static int[] def;
	public static void main(String[] args) {
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			read();
			solve();
		}
	}
	static boolean read(){
		index_number = sc.nextInt();
		data = new int[index_number];
		for(int i = 0; i < index_number; i++){
			data[i] = sc.nextInt();
			//System.out.println(data[i]);
		}
		return true;
	}
	static void solve(){
		def = new int[index_number - 1];
	//	System.out.println("def.length = " + def.length + "index_number - 1 = " + (index_number - 1));
		for(int i = 0; i < def.length; i++){
			def[i] = data[i+1]-data[i];
		}
		Arrays.sort(def);
		int flag_min = 0, flag_max = 0;
		for(int i = 0; i < def.length; i++){
			if(def[i] > 0)flag_max++;
			if(def[i] < 0)flag_min++;
		}
		if(flag_max != 0){
			System.out.println(def[def.length-1] + " ");	
		}else{
			System.out.println(0);
		}
		
		if(flag_min != 0){
			System.out.println(Math.abs(def[0]) + " ");	
		}else{
			System.out.println(0);
		}
		
	}

}
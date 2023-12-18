import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			Scanner scstr = new Scanner(line);
			scstr.useDelimiter(",");
			int[] stations = new int[10];
			for(int i = 0; i < 10; i++) stations[i] = scstr.nextInt();
			int v1 = scstr.nextInt();
			int v2 = scstr.nextInt();
			
			System.out.println(countFromStation1(v1, v2, stations));
			
			scstr.close();
		}
		sc.close();
	}
	static double travelerCalculation(int l, int v1, int v2) {
		return (double)l / (double)(v1 + v2) * (double)v1;
	}
	
	static int countFromStation1(int v1, int v2, int... stations) {
		int sumLength = sum(stations);
		double len_frm_st1 = travelerCalculation(sumLength, v1, v2);
		int cnt_frm_st1 = 0;
		for(int i = 0; i < stations.length; i++) {
			cnt_frm_st1 += stations[i];
			if(cnt_frm_st1 >= len_frm_st1) return i + 1;
		}
		return stations.length;
	}
	
	static int sum(int[] array) {
		int result = 0;
		for(int i: array) result += i;
		return result;
	}
}
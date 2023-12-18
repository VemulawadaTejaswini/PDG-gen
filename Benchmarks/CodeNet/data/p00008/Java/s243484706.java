import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){	//nextlineがeofならエラーを吐いて自動的に止まる
			int n = Integer.parseInt(br.readLine());
			System.out.println(NumComCalcurate(n));
			}
		} catch (Exception e){}
	}
	static int NumComCalcurate(int n){
		int count = 0;
		for(int a=0; a<=9; a++){
			for(int b = 0; b<=9; b++){
				for(int c = 0; c<=9; c++){
					for(int d= 0; d<=9; d++){
						if(a+b+c+d==n){count+=1;
						}
					}
				}
			}
		}
		return count;
	}
}
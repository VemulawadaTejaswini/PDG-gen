import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int w, n;//cÆ¡ÌÇÝÝ
	static int[] Amida;//zñ¢íÉ­¶
	
	public static void main(String[] args) {	
		while(read()){
			slove();
		}
	}
	static boolean read(){
		w = sc.nextInt();
		n = sc.nextInt();
		return true;
	}
	static void slove(){
		int temp;
		String line;
		String[] d_line;
		Amida = new int[w+1];
		for(int k = 1; k <= w; k++){
			Amida[k] = k;
			//System.out.print(Amida[k]);
		}
		for(int i = 0; i < n; i++){
			line = sc.next();
			d_line = line.split(",");
			//System.out.println(d_line[0]);
			//System.out.println(d_line[1]);
			temp = Amida[Integer.parseInt(d_line[1])];
			//System.out.println(temp);
			Amida[Integer.parseInt(d_line[1])] = Amida[Integer.parseInt(d_line[0])];
			
			Amida[Integer.parseInt(d_line[0])] = temp;
			
		}
		for(int j = 1; j < Amida.length; j++){
			System.out.println(Amida[j]);
		}
	}
}
import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();
		String num_ = br.readLine();
		int[] num = m.splitIntChange(num_);
		int cir = num[0]*2+num[1]*2;
		int squ = num[0]*num[1];
		System.out.println(squ+" "+cir);
	}
	
	public int[] splitIntChange(String str){
		String[] str_ = str.split(" ");
		int strlen = str_.length;
		int[] numarray = new int[strlen];
		
		for(int i = 0;i < strlen;i++){
			numarray[i] = Integer.parseInt(str_[i]); 
		}
		
		return numarray;
	}
}
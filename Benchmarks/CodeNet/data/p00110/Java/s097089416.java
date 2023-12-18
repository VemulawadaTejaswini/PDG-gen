import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;
		String c;
		String[] num1, num2, num3;
		int n1, n2, n3;

		while((line = in.readLine()) != null){
			if(line.length() == 0){
				break;
			}

			n1 = 0;
			n2 = 0;
			n3 = 0;
			String[] dst = line.split("\\+");
			n1 = dst[0].length();
			dst = dst[1].split("=");
			n2 = dst[0].length();
			n3 = dst[1].length();

			num1 = new String[n1];
			num2 = new String[n2];
			num3 = new String[n3];

			for(int i=0; i<line.length(); i++){
				if(i < n1){
					num1[n1-i-1] = line.substring(i, i+1);
				}

				else if(i >= n1+1 && i< n1+n2+1){
					num2[n2-i+n1] = line.substring(i, i+1);
				}

				else if(i>=n1+n2+2){
					num3[n3-i+n1+n2+1] = line.substring(i, i+1);
				}
			}

			for(int i=0; i<=9; i++){
				if(isOK(num1, num2, num3, i)){
					Ans.add(i);
					break;
				}

				if(i==9){
					Ans.add(-1);
				}
			}
		}

		for(int i=0; i<Ans.size(); i++){
			if(Ans.get(i) == -1){
				System.out.println("NA");
			}
			else{
				System.out.println(Ans.get(i));
			}
		}
	}

	public boolean isOK(String[] num1, String[] num2, String[] num3, int x){
		int a, b, c;
		int d = 0;
		int e = 0;
		if(x==0 && (num1[num1.length-1].equals("X") || num2[num2.length-1].equals("X") || num3[num3.length-1].equals("X"))){
			return false;
		}
		
		while(true){
			if(d >= num1.length) a = 0;
			else a = (num1[d].equals("X")) ? x : Integer.parseInt(num1[d]);
			if(d >= num2.length) b = 0;
			else b = (num2[d].equals("X")) ? x : Integer.parseInt(num2[d]);
			if(d >= num3.length) c = 0;
			else c = (num3[d].equals("X")) ? x : Integer.parseInt(num3[d]);

			if(d >= num1.length && d >= num2.length && d >= num3.length) break;

			if((a+b+e)%10 != c){
				return false;
			}
			else{
				e = (a+b) / 10;
				d++;
			}
		}

		return true;
	}
}
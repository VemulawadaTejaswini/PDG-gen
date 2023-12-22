import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		str=bfr.readLine();
		String[] wake=str.split(" ");
		int kazu1=Integer.parseInt(wake[0]);
		int kazu2=Integer.parseInt(wake[1]);
		if((kazu1+kazu2)%2==0) {
			System.out.println((kazu1+kazu2)/2);
		}
		else {
			System.out.println((kazu1+kazu2)/2+1);
		}
	}
}
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(reader.readLine());
	int t = N%10;
	if(t==0 || t==1 || t==6||t==8){
		System.out.println("pon");
		return;
	}
	else if(t==3){
		System.out.println("bon");
		return;
	}
	else{
	System.out.println("hon");
	return;
	}
	}
}

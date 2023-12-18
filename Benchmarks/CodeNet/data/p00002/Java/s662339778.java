import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int a,b;
		while((str=in.readLine())!=null){
			a=getA(str);
			b=getB(str);
			System.out.println(countDigit(a+b));
		}
		
	}
	
	public static int getA(String str){
		int index,num;
		index = str.indexOf(" ");
		num=Integer.parseInt(str.substring(0,index));
		return num;
	}
	
	public static int getB(String str){
		int index,num;
		index = str.indexOf(" ");
		num=Integer.parseInt(str.substring(index+1));
		return num;
	}
	
	public static int countDigit(int num){
		int dig=1;
		while(num>=10){
			num=num/10;
			dig++;
		}		
		return dig;
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		Data d = new Data();
		String maxLen ="";
		int max=0;
		for(int i = 0 ; i < str.length ; i ++){
			if(Arrays.asList(d.str).contains(str[i])){
				d.add(str[i]);
			}
			else
				d.push(str[i], i);
			if(max<str[i].length()){
				maxLen=str[i];
			}
		}
		d.print(maxLen);
	}
}
class Data{
	int[] num = new int[1000];
	String[] str = new String[1000];
	void push(String s, int n){
		num[n]=1;
		str[n]=s;
	}
	void add(String s){
		for(int i = 0 ; i < 1000 ; i ++){
System.out.println(str[i]+" "+s);
			if(str[i].equals(s)){
				num[i]++;
				break;
			}
		}
	}
	void print(String maxLen){
		int j = 0;
		int max = 0;
		for(int i=0;i<str.length;i++){
			if(max<num[i]){
				max=num[i];
				j=i;
			}
		}
		System.out.println(str[j]+" "+maxLen);
	}
}
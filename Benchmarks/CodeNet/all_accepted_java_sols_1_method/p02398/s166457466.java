import java.io.*;

public class Main{
public static void main(String[] args){
try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().split(" ");
	int a = Integer.parseInt(str[0]);
	int b = Integer.parseInt(str[1]);
	int c = Integer.parseInt(str[2]);

	int count = 0;
	for(int i = a; i <=b ; i++){
		if (c % i == 0){
		count++;
		}
	}
System.out.println(count);
}catch(IOException e){
System.out.println(e);
}
}
}
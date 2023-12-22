import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	int a,b,c;
	String s = buf.readLine();
	String[] strlAry =s.split(" ");
	for(int i=0;i<strlAry.length;i++){
	}	
	a= Integer.parseInt(strlAry[0]);
	b= Integer.parseInt(strlAry[1]);
	c= Integer.parseInt(strlAry[2]);

	if(a<b&&b<c){
		System.out.println("Yes");
		}
	else{
		System.out.println("No");
	}

	}
}
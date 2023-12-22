import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		String n=a.readLine();
		String str=a.readLine();
		String[] i=str.split(" ");
		for (int m=Integer.parseInt(n)-1;m>=0;m--){
			if(m!=0){System.out.print(i[m]+" ");}
			else{System.out.println(i[m]);}
		}
	}
}
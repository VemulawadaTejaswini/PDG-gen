import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] num=str.split(" ");
		int m=Integer.parseInt(num[0]);
		int r=Integer.parseInt(num[1]);
		int f=Integer.parseInt(num[2]);
		while (m!=-1 || r!=-1 || f!=-1){
			
			if (m==-1 || r==-1){
				System.out.println("F");
			}else if(m+r>=80){
				System.out.println("A");
			}else if(m+r>=65){
				System.out.println("B");
			}else if(m+r>=50 || f>=50){
				System.out.println("C");
			}else if(m+r>=30){
				System.out.println("D");
			}else {
				System.out.println("F");
			}
			str=br.readLine();
			num=str.split(" ");
			m=Integer.parseInt(num[0]);
			r=Integer.parseInt(num[1]);
			f=Integer.parseInt(num[2]);
		}
	}
}
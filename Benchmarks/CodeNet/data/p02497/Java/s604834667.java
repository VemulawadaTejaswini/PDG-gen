import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int m, f, r;
		String grade = ".";
		try{
			while(null != (line=reader.readLine())){
				linearr = line.split(" ");
				m = Integer.parseInt(linearr[0]);
				f = Integer.parseInt(linearr[1]);
				r = Integer.parseInt(linearr[2]);
				if(m==-1 || f==-1){
					if(r==-1){
						return;
					}
					grade = "F";
				}else if(m+f >= 80){
					grade = "A";
				}else if(m+f >= 65){
					grade = "B";
				}else if(m+f >= 50){
					grade = "C";
				}else if(m+f >= 30){
					if(r>=50){
						grade = "C";
					}else{
						grade = "D";
					}
				}else{
					grade = "F";
				}
				System.out.println(grade);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
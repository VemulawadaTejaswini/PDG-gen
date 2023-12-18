import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int m, f, r, w;
		String grade;
		try{
			while(null != (line=reader.readLine())){
				linearr = line.split(" ");
				m = Integer.parseInt(linearr[0]);
				f = Integer.parseInt(linearr[1]);
				r = Integer.parseInt(linearr[2]);
				w = m+f;
				if(m==-1 || f==-1){
					if(m==-1 && f==-1 && r==-1){
						return;
					}
					grade = "F";
				}else if(w >= 80){
					grade = "A";
				}else if(w >= 65){
					grade = "B";
				}else if(w >= 50){
					grade = "C";
				}else if(w >= 30){
					grade = "D";
					if(r>=50){
						grade = "C";
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
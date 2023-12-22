import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = null;
			while(!(line = br.readLine()).equals("-1 -1 -1")){
				String[] str = line.split(" ");
				int m = Integer.parseInt(str[0]);
				int f = Integer.parseInt(str[1]);
				int r = Integer.parseInt(str[2]);
				String Grade;
				if (m==-1 || f==-1){
					Grade = "F";
				}else if(m+f>=80){
					Grade = "A";
				} else if (m+f>=65){
					Grade = "B";
				} else if (m+f>=50){
					Grade = "C";
				} else if (m+f>=30){
					Grade = "D";
					if (r>=50){
						Grade = "C";
					}
				} else {
					Grade = "F";
				}
				System.out.println(Grade);
			}
		} catch(Exception e){}
	}
}
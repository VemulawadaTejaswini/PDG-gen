import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public int[] month = new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while((line = in.readLine()) != null){
			String[] tmp = line.split(" ");
			int y1 = Integer.parseInt(tmp[0]);
			int m1 = Integer.parseInt(tmp[1]);
			int d1 = Integer.parseInt(tmp[2]);
			int y2 = Integer.parseInt(tmp[3]);
			int m2 = Integer.parseInt(tmp[4]);
			int d2 = Integer.parseInt(tmp[5]);

			if(y1<0 || m1<0 || d1<0 || y2<0 || m2<0 || d2<0){
				break;
			}

			int n1 = date_to_num(y1, m1, d1);
			int n2 = date_to_num(y2, m2, d2);
			System.out.println(n2 - n1);
		}
	}

	public int date_to_num(int y, int m, int d){
		int yy = y-1;
		int n = yy*365;
		for(int i=0; i<m-1; i++){
			n += month[i];
		}
		n += d;
		n += yy/4 - yy/100 + yy/400;
		if(m>=3 && ((y%4==0 && y%100!=0) || y%400==0)){
			n++;
		}

		return n;
	}
}
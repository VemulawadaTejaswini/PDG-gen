import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new
				BufferedReader(new InputStreamReader(System.in));
			String snow = br.readLine();
			int inow = Integer.parseInt(snow);
			while(true){
				String kigo = br.readLine();
				if(kigo.equals("="))break;
				String snum = br.readLine();
				int inum = Integer.parseInt(snum);
				if(kigo.equals("+"))inow+=inum;
				else if(kigo.equals("-"))inow-=inum;
				else if(kigo.equals("*"))inow*=inum;
				else inow/=inum;
			}
			System.out.println(inow);
	}

}
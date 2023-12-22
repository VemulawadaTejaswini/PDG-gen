import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str;
		int m,f,r;

		while(true){
			str = buf.readLine().split(" ");
			m = Integer.parseInt(str[0]);
			f = Integer.parseInt(str[1]);
			r = Integer.parseInt(str[2]);
			if(m==-1 && f==-1 && r==-1)
				break;
			if(m == -1 || f == -1 || (m+f)<30)
				sb.append("F"+"\n");
			else{
				if(m+f >= 80)
					sb.append("A" + "\n");
				if(m+f>=65 && m+f <80)
					sb.append("B" + "\n");
				if(m+f>=50 && m+f<65)
					sb.append("C" + "\n");
				if(m+f>=30 && m+f<50){
					if(r >= 50)
						sb.append("C" + "\n");
					else 
						sb.append("D"+"\n");
				}
			}

		}
		System.out.print(sb);		
	}
}
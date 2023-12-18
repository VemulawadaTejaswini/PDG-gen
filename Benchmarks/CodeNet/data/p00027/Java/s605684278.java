import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] dow={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int[] len={2,31,29,31,30,31,30,31,31,30,31,30,31};
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;
		int m,d;
		for(int i=0;i<12;i++)len[i+1]+=len[i];
		while((t=bf.readLine())!=null){
			m=Integer.parseInt(t.split(" ")[0]);
			d=Integer.parseInt(t.split(" ")[1]);
			if(m==0)break;
			System.out.println(dow[(len[m-1]+d)%7]);
		}
	}
}
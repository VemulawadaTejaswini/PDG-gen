import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int summoney,sumcount;
		int number;
		summoney=0;
		sumcount=0;
		number=0;
		int[] n=new int[2];
		try{
			while(true){
				s=reader.readLine();
				if(s.equals("")){
					break;
				}
				t=s.split(",");
				for(int i=0;i<t.length;i++){
					n[i]=Integer.parseInt(t[i]);
				}
				summoney+=n[0]*n[1];
				sumcount+=n[1];
				number++;
			}
			System.out.println(summoney+" "+(int)(Math.ceil((double)sumcount/number)));
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
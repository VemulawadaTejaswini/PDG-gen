import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int n = -1;
		int r = -1;
		int p = -1;
		int c = -1;
		int i;
		int[] fuda;
		int[] _fuda;
		//0 ~ n: ???????????????
		try{
			while(null != (line=reader.readLine())){
				linearr = line.split(" ");
				n = Integer.parseInt(linearr[0]);
				r = Integer.parseInt(linearr[1]);
				if(n==0 && r==0){
					break;
				}
				fuda = new int[n];
				for(i=0; i<n; i++){
					fuda[i] = i+1;
				}
				for(i=0; i<r; i++){
					line = reader.readLine();
					linearr = line.split(" ");
					p = Integer.parseInt(linearr[0]);
					c = Integer.parseInt(linearr[1]);
					_fuda = (int[])fuda.clone();
					System.arraycopy(fuda, n-p-c+1, fuda, n-c, c);
					System.arraycopy(_fuda, n-p+1, fuda, n-p-c+1, p-1);
					//System.out.println("<"+fuda+", "+_fuda+">");
				}
				System.out.println(fuda[fuda.length-1]);
			}
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		int num;
		int[] a = new int[3];
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line," ");
			for(int i=0;i<a.length;i++){
				a[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=0;i<a.length-1;i++){
				for(int j=1;j<a.length;j++){
					if(a[i] > a[j]){
						num = a[i];
						a[i] = a[j];
						a[j] = num;
					}
				}
			}
			System.out.println(a[0]+" "+a[1]+" "+a[2]);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
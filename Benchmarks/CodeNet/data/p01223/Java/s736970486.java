import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n;
		int box;
		String[] HIGH;
		int[] h;
		try{
			while((s=r.readLine()) !=null){
				n=Integer.parseInt(s);
				for(int i=0;i<n;i++){
					String kosuu=r.readLine();
					String highdata=r.readLine();
					box=Integer.parseInt(kosuu);
					HIGH=highdata.split(" ");
					h=new int[HIGH.length];
					for(int a=0;a<HIGH.length;a++){
						h[a]=Integer.parseInt(HIGH[a]);
					}
					int[] highdifup=new int[box-1];
					int[] highdifdown=new int[box-1];
					for(int b=0;b<box-1;b++){
						highdifup[b]=h[b+1]-h[b];
					}
					for(int c=0;c<box-1;c++){
						highdifdown[c]=h[c]-h[c+1];
					}
					Arrays.sort(highdifup);
					Arrays.sort(highdifdown);
					if(highdifup[box-2]<0){highdifup[box-2]=0;}
					if(highdifdown[box-2]<0){highdifdown[box-2]=0;}
					System.out.println(highdifup[box-2]+" "+highdifdown[box-2]);
					for(int w=0;w<box-1;w++){
						highdifup[w]=0;
						highdifdown[w]=0;
					}
				}
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
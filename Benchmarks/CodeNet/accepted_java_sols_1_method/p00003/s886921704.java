import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int a;
		try{
			while((s=reader.readLine()) !=null){
				a=Integer.parseInt(s);
				String[] n =new String[a];
				for(int j =0;j<a;j++){
					t=reader.readLine().split(" ");
					int[] r=new int[3];
					for(int i=0;i<t.length;i++){
						r[i] =Integer.parseInt(t[i]);
					}
					Arrays.sort(r);
					if(r[0] ==0 ||r[1] ==0 ||r[2] ==0){System.out.println("NO");}
					if(((r[0])*(r[0]))+((r[1])*(r[1])) ==((r[2])*(r[2]))){
						n[j] ="YES";
					}else{
						n[j] ="NO";
					}
				}
				for(int k =0;k<a;k++){
					System.out.println(n[k]);
				}
				continue;
			}
		}catch(IOException e){
			System.exit(0);
		}
	}
}
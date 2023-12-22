import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String line;
	while((line=br.readLine())!=null){
	    int hit=0,blow=0;
	    int[] a =new int[4];
	    int[] b =new int[4];
	    StringTokenizer st = new StringTokenizer(line);
	    for(int i = 0;i<4; i++){
		a[i]=Integer.parseInt(st.nextToken());
	    }
	    st = new StringTokenizer(br.readLine());
	    for(int i = 0;i<4;i++){
		b[i]=Integer.parseInt(st.nextToken());
	    }
	    for(int i = 0;i<4;i++){
		for(int j = 0;j<4;j++){
		    if(i==j&&a[i]==b[j]){
			hit++;
		    }
		    if(i!=j&&a[i]==b[j]){
			blow++;
		    }
		}
	    }
	    System.out.println(hit+" "+blow);
	}
    }
}
			
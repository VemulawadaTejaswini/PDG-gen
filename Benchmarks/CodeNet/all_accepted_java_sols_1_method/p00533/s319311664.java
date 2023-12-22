import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

class Main{
    public static void main(String[] args)throws IOException {
    	InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String s=br.readLine();
        int h=parseInt(s.substring(0,s.indexOf(' ')));
        int w= parseInt(s.substring(s.indexOf(' ') + 1));
        for(int i=0;i<h;i++){     
        	char []cl=br.readLine().toCharArray();
        	int flag=-1;
        	for(int j=0;j<w;j++){
        		if(flag>-1)flag++;
        		if(cl[j]=='c')flag=0;
        		if(j==0){
        			System.out.print(flag);
        		}else System.out.print(" "+flag);
        	}
        	System.out.println();
        }        
        br.close();
    }
}
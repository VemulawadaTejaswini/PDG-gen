import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args)throws IOException {
    	InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String hw[]=br.readLine().split(" ");
        for(int i=0;i<Integer.parseInt(hw[0]);i++){     
        	char []cl=br.readLine().toCharArray();
        	int flag=-1;
        	for(int j=0;j<Integer.parseInt(hw[1]);j++){
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
import java.util.*;
import java.io.*;
public class Main {
	private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private static int getInt(){return Integer.parseInt(parseStdin());}
    private static String parseStdin(){
        String strNum=null;
        try {
            String line=br.readLine();
            if(line!=null)
                if(!line.isEmpty())
                    strNum = line;
        }
        catch(IOException e){}
        return strNum;
    }
	public static void main(String args[]){
		int n=getInt();
		while(n!=0){
			int sum=getInt();
			int ans=sum;
			for(int i=1;i<n;i++){
				int x=getInt();
				if(sum>0)sum+=x;
				else	sum=x;
				if(ans<sum)
					ans=sum;
			}
			n=getInt();
			System.out.println(ans);
		}
	}
}
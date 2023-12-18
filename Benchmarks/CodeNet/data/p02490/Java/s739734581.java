import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		int x=0;
		int y=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try{
				String s=br.readLine();
        x=Integer.parseInt(s.substring(0,s.indexOf(" ")));
        y=Integer.parseInt(s.substring(s.indexOf(" ")+1,s.length()));
      }catch (NumberFormatException e){
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
        //e.printStackTrace();
			}
			if(x==0&&y==0){
				break;
			}
			System.out.println((int)Math.min(x,y)+" "+(int)Math.max(x,y));
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atcoder{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String line;
	int Line=Integer.parseInt(br.readLine());
    	while(Line>1000){
      		Line-=1000;
			if(Line<1000){System.out.print(Line);}
      	}
		if(Line==1000){System.out.print("0");}
  }
}
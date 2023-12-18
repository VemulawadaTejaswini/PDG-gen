import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=stdIn.nextInt();
		String soot[]={"S","H","C","D"};
		boolean card[][];
		card=new boolean[4][14]; //S:0 H:1 C:2 D 3
		String s;
		for(int i=0;i<n;i++){
			s=br.readLine();
			String[] ss=s.split(" ");
			int lank=Integer.parseInt(ss[1]);
			int tmp;
			switch(ss[0]){
			case "S":tmp=0;break;
			case "H":tmp=1;break;
			case "C":tmp=2;break;
			case "D":tmp=3;break;
			default :tmp=-1;break;
			}
			card[tmp][lank]=true;
		}
		for(int i=0;i<4;i++){
			for(int j=1;j<=13;j++){
				if(card[i][j]==false)
					System.out.println(soot[i]+" "+j);
			}
		}
	}
}
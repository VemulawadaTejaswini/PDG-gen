import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(true){
			String in=s.next();
			if(in.equals("#"))System.exit(0);
			String[]str=in.split("\\|");
			boolean ok=false;
			for(int i=0;i<str.length;i++){
				String now=str[i].substring(1,str[i].length()-1);
				String tmp[]=now.split("\\&");
				boolean OK=true;
				for(int j=0;j<tmp.length;j++)for(int k=0;k<tmp.length;k++){
					if(tmp[k].equals("~"+tmp[j]))OK=false;
				}
				if(OK)ok=true;
			}
			if(ok)System.out.println("yes");
			else System.out.println("no");
		}
	}
}
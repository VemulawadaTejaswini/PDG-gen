import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		int i,j;
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			int ans = -1;
			String[] s = scan.next().split("[\\+=]");
			BigInteger[] bi = new BigInteger[3];

			for(i=0;ans==-1 && i<=9;i++){
				if(i == 0){
					if((s[0].charAt(0)=='X' && s[0].length()==1 || s[0].charAt(0)!='X') &&
						 (s[1].charAt(0)=='X' && s[1].length()==1 || s[1].charAt(0)!='X') &&
						 (s[2].charAt(0)=='X' && s[2].length()==1 || s[2].charAt(0)!='X')){
						for(j=0;j<3;j++) bi[j] = new BigInteger(s[j].replaceAll("X","0"));
						if(bi[2].equals(bi[0].add(bi[1]))) ans = 0;
					}
				}
				else{
					for(j=0;j<3;j++) bi[j] = new BigInteger(s[j].replaceAll("X",Integer.toString(i)));
					if(bi[2].equals(bi[0].add(bi[1]))) ans = i;
				}
			}

			if(ans == -1) System.out.println("NA");
			else System.out.println(ans);
		}
	}
}
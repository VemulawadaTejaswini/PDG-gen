import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] cArr = new char[h][w];

		for(int i=0; i<h; i++){
			String str = sc.next();
			for(int j=0; j<str.length(); j++){
				cArr[i][j] = str.charAt(j);
			}
		}
	
		boolean flag = true;

		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				if(cArr[i][j] =='#'){
					if((i-1)>=0 && cArr[i-1][j]=='#'){
						continue;
					}else if((i+1)<h && cArr[i+1][j]=='#'){
						continue;
					}else if((j-1)>=0 && cArr[i][j-1]=='#'){
						continue;
					}else if((j+1)<w && cArr[i][j+1]=='#'){
						continue;
					}else{
						flag = false;
						break;
					}
				}
			}
			if(!flag) break;
		}
		
		if(!flag){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}

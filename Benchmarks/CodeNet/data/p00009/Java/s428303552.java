import java.util.*;
import java.io.*;

class Main
{
	static final Scanner stdin = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int res,flag;
		
		while(stdin.hasNext()){
			int n = stdin.nextInt();
			res  = 0;

			for(int i = 2; i <= n;i++){
				flag = 0;
				for(int j = 2;j<i;j++){
					if(i%j==0){
						flag = 1;
						break;
					}
				}
				if(flag == 0){
					res+=1;
				}
			}
			System.out.println(res);
		}
	}
}
import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s;
		s=new String[n];
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
			for(int i=0;i<n;i++)s[i]=reader.readLine();
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(s[i].compareTo(s[j])>=0){
						String k=s[i];
						s[i]=s[j];
						s[j]=k;
					}
				}
			}
			System.out.println(s[0]);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
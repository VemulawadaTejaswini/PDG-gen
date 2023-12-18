import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> LL=new ArrayList<Integer>();
		while(true){
			String s=r.readLine();
			int n=Integer.parseInt(s);
			for(int i=1;i<=n;i++){
				list.add(i);
			}
			int number=0;
			for(int a=0;a<list.size();a++){
				int count=0;
				for(int b=1;b<list.get(a);b++){
					if(list.get(a)%b==0){
						count++;
					}
				}
				if(count==1){
					number++;
				}
			}
			System.out.println(number);
			list.clear();
		}
	}
}
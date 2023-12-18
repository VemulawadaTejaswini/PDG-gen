import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	BufferedReader input;
	
	String solve(String[] str){
		StringBuilder[] number=new StringBuilder[2];
		for(int i=0;i<2;++i){
			number[i]=new StringBuilder(str[i]);
			number[i].reverse();
		}
		StringBuilder solution=new StringBuilder(80);
		int carry=0;
		for(int i=0;i<Math.max(number[0].length(),number[1].length());++i){
			int a[]=new int[2];
			for(int j=0;j<2;++j)a[j]=(int)(i<number[j].length()?number[j].charAt(i)-'0':0);
			int x=(a[0]+a[1]+carry)%10;
			carry=(a[0]+a[1]+carry)/10;
			solution.append(x);
		}
		if(carry>0){
			solution.append(carry);
		}
		solution.reverse();
		return solution.length()<=80?solution.toString():"overflow";
	}
	
	void io(){
		input=new BufferedReader(new InputStreamReader(System.in));
		String[] str=new String[2];
		int n=0;
		try {
			 n=Integer.parseInt(input.readLine());
		} catch (Exception e) {}
		for(int i=0;i<n;++i){
			for(int j=0;j<2;++j){
				try{
				str[j]=input.readLine();
				}catch(Exception e){}
			}
			System.out.println(solve(str));
		}		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}
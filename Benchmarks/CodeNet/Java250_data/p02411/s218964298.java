import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int f=sc.nextInt();
		int r=sc.nextInt();
		int g=m+f;
		String out;
		while(m!=-1 || f!=-1 || r !=-1){
			if(m==-1 || f==-1){
				out="F";
			}else if(g>=80){
				out="A";
			}else if(g>=65){
				out="B";
			}else if(g>=50){
				out="C";
			}else if(g>=30){
				if(r>=50){
					out="C";
				}else out="D";
			}else{ 
				out="F";
			}//if
		System.out.println(out);
		m=sc.nextInt();
		f=sc.nextInt();
		r=sc.nextInt();
		g=m+f;
		}//while
		
	}
}
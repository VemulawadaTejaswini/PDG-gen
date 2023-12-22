import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		String ret="";
		for(int i=0;i<n;i++){
			str[i]=sc.next();
			if(i==0||str[i].compareTo(ret)<0)ret=str[i];
		}
		System.out.println(ret);
	}
}
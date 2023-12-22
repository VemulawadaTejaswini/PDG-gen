import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,i;
		String str1,str2;
		while(true){
			a=sc.nextInt();
			b=sc.nextInt();
			if(a==0&&b==0)System.exit(0);
			str1="";
			str2="";
			for(i=0;i<b;i++){
				str1=str1+"#";
				if(i==0 || i==b-1)
					str2=str2+"#";
				else
					str2=str2+".";
			}
			for(i=0;i<a;i++){
				if(i==0 || i==a-1)
					System.out.println(str1);
				else
					System.out.println(str2);
			}
			System.out.println();
		}
	}
}

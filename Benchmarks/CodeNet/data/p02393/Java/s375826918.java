import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int a,b,c;
		Scanner br =new Scanner(System.in);
		a=br.nextInt();
		b=br.nextInt();
		c=br.nextInt();
		int s_1=0,s_2=0,s_3=0;
		if(a<b){
			s_1=a;
			s_2=b;
		}else{
			s_1=b;
			s_2=a;
		}
		if(s_1<c && s_2<c){
			s_3=c;
		}else if(s_1>c && s_2<c){
			s_3=s_2;
			s_2=c;
		}else if(s_1>c && s_2>c){
			s_3=s_2;
			s_2=s_1;
			s_1=c;
		}
		System.out.println(s_1+" "+s_2+" "+s_3);
	}
}
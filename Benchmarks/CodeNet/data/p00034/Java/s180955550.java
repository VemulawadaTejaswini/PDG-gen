import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		double v1,v2,sum=0,sum1=0,ans,in[]=new double[12];
		double x;
		while(sc.hasNext()){
			String str[]=sc.next().split(",");
			for(i=0;i<12;i++){
				in[i]=Double.parseDouble(str[i]);
			}
			v1=in[10];v2=in[11];
			for(i=0;i<10;i++){
				sum+=in[i];
			}
			x=v1*sum/(v2+v1);
//			System.out.println(sum+" "+v1+" "+v2);
//			System.out.println(x);
			for(i=0;i<10;i++){
				sum1+=in[i];
				if(x<=sum1){
					System.out.println(i+1);
					sum1=0;sum=0;break;
				}
			}
		}//while
	}
}
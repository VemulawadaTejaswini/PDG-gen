import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fj[]={4,1,4,1,2,1,2,1};
		int c[]=new int[8];
		String ans="";
		
		while(sc.hasNext()){
			int min=1000000000,k=0,sum=0;
			
			for(int i=0;i<8;i++){
				c[i]=sc.nextInt();
			}
			
			for(int i=0;i<8;i++){
				k=0;sum=0;
				for(int j=i;j-i<8;j++){
					int temp=c[k]-fj[j%8];
					if(temp<0) temp=0;
					sum+=temp;
					k++;
				}
				if(sum<min){
					ans="";
					for(int h=i;h-i<7;h++){
						ans+=Integer.toString(fj[h%8])+" ";
					}
					ans+=Integer.toString(fj[(i+7)%8]);
					min=sum;
				}
				else if(sum==min){
					System.out.println("!");
					ans=compare(ans,i,fj);
				}
			}
			System.out.println(ans);
		}
	}
	
	static String compare(String a,int k,int fj[]){
		String b="";
		for(int h=k;h-k<7;h++){
			b+=Integer.toString(fj[h%8])+" ";
		}
		b+=Integer.toString(fj[(k+7)%8]);
		
		if(a.compareTo(b)==-1){
			return a;
		}
		else{
			return b;
		}
	}
}
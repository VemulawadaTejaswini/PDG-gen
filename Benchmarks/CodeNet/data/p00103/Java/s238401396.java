import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt1=0,base1=0,point1=0;
		int cnt2=0,base2=0,point2=0;
		int j=0,k=0;
		String s[]=new String[100];
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			while(true){
				if(cnt1==3)break;
				s[j]=sc.next();
				if(s[j]=="OUT")cnt1++;
				if(s[j]=="HIT"){
					base1++;
					if(base1==4){
						base1=3;
						point1++;
					}
				}
				if(s[j]=="HOMERUN")point1=base1*1+1;
				j++;
			}
			while(true){
				if(cnt2==3)break;
				s[k]=sc.next();
				if(s[k]=="OUT")cnt2++;
				if(s[k]=="HIT"){
					base2++;
					if(base2==4){
						base2=3;
						point2++;
					}
				}
				if(s[k]=="HOMERUN")point2+=base2*1+1;
				k++;
			}
			System.out.print(point1+' '+point2);
		}
	}
}
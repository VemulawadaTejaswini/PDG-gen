import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j,tmp,m,min=0,max=0,keta=1;
		int a[]=new int[8]; 
		String str;
		char ch[]=new char[8];
		while(n--!=0){
			max=0;min=0;
			str=sc.next();
			ch=str.toCharArray();
			for(i=0;i<8;i++){
				a[i]=ch[i]-'0';
			}
			for(i=0;i<8;i++){
				m=i;
				for(j=i;j<8;j++){
					if(a[j]<a[m]) m=j;
				}
				tmp=a[m];
				a[m]=a[i];
				a[i]=tmp;
			}//
			keta=1;
			for(i=0;i<8;i++){
				max+=a[i]*keta;
				keta*=10;
			}
			keta=1;
			for(i=7;i>=0;i--){
				min+=a[i]*keta;
				keta*=10;
			}
			System.out.println(max-min);
		}
	}
}
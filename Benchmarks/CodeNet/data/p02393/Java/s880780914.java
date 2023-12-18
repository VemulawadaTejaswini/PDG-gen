import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String indata;
		int a[] = new  int[3];
		int store;
		for(int i=0;i<3;i++){
			indata=s.next();
			a[i]=Integer.parseInt(indata);
		}
		int flag;
		while(true){
			flag=0;
			for(int i=0;i<2;i++){
				if(a[i]>a[i+1]){
					store=a[i];
					a[i]=a[i+1];
					a[i+1]=store;
					flag=1;
				}
			}if(flag==0)break;
		}
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}
}
import java.util.Scanner;
public class Main{
	int n,p,d1,d2,maxp,max;
	int sw=1;
	public void inout(){
		Scanner sc = new Scanner(System.in);
		while(sw==1){
			n= sc.nextInt();
			if(n==0){
				break;
			}else{
				max=-1;
				for(int i =0;i<n;i++){
					p=sc.nextInt();
					d1=sc.nextInt();
					d2=sc.nextInt();
					
					if(max<d1+d2){
						max=d1+d2;
						maxp=p;
					}
				}
				System.out.println(maxp+" "+max);
			}
		}
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.inout();
	}
}
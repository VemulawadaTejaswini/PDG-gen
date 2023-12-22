import java.util.*;
public class Main {
	public static int ishuan(int n){
		int a1=n%10;
		int a2=n/10000;
		int b1=(n%100-n%10)/10;
		int b2=(n/1000-n/10000*10);
		if(a1==a2&&b1==b2){
			return 1;
		}else{
			return 0;
		}
		
		
	}
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        while(kb.hasNext()){
        	int a=kb.nextInt();
        	int b=kb.nextInt();  
        	int sum=0;
        	for (int i = a; i <= b; i++) {
				int ans=ishuan(i);
				if(ans==1){
					sum++;
				}
			}
        	System.out.println(sum);
        }
              
    }

}
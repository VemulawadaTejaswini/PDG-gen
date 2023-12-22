import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int sum=0;
		num-=num%5;
		do{
			if(num/500>0){
				sum+=(num/500)*1000;
				num%=500;
			}
			else if(num/5>0){
				sum+=(num/5)*5;
				num%=5;
			}
			else break;
		}while(num>0);
		
		System.out.println(sum);
	}
}
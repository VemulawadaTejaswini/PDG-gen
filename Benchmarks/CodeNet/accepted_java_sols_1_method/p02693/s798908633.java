import java.util.Scanner;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int K=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		for(int i=A;i<=B;i++){
			if(i%K==0){
				flag=true;break;
			}
			else{
				flag=false;
			}
			
		}
		
		if(flag)System.out.println("OK");
		else System.out.println("NG");
	}
}
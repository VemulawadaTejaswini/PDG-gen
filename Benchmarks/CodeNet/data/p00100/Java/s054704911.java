import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
int n;
int b;
int t;
int s;
int gaku=0;
int flag=0;
int ban=0;
int count=0;

	for(;flag!=9;){
		n=sc.nextInt();
		
		for(int i=0;i<n;i++){
		b=sc.nextInt();
		t=sc.nextInt();
		s=sc.nextInt();
		if(ban==b){
			gaku = gaku+(t*s);
		}else{
			gaku = t*s;	
		}
		
		if(gaku>=1000000){
			System.out.println(b);
			count++;
		}
				
		ban=b;	
		}
		gaku=0;
		count=0;
		ban=0;
		
		if(n==0){
			flag=9;
		}else {
			System.out.prinln("NA");
		}
	}

		}
	}
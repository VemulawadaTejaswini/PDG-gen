import java.util.Scanner;
class Main{
	static Scanner sc;
	static int n,small,big;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		while(sc.hasNext()){
			small=-1;
			big=-1;
			n=sc.nextInt();
			for(int j=n-1;j>1;j--){
				for(int i=j-1;i>1;i--){
					if(j%i==0){break;}
					if(i==2){small=j;}
				}
				if(small!=-1){break;}
			}
			int j=n;
			while(true){
				j++;
				for(int i=j-1;i>1;i--){
					if(j%i==0){break;}
					if(i==2){big=j;}
				}
				if(big!=-1){break;}
			}
			if(small==-1){small=2;}
			System.out.println(small+" "+big);
		}
	}
}
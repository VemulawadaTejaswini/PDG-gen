import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		int k =0;
		for(int i=0;i<3;i++){
			if(b==0){
				k=1;
			}
			if((int)(b/Math.pow(10,i))==0){
				break;	
			}
			k++;
		}

		int h = a * (int)Math.pow(10,k) + b;
		boolean yes = false;
		
		for(int i=0;i<=317;i++){
			if(h == i*i){
				yes = true;
			}
		}

		System.err.println(h);
		if(yes){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}
	}
}

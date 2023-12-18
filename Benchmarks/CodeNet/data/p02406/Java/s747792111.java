import java.util.Scanner;
class Main{
    public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		call(n);
    }
	public static void call(int n){
		int i=1;
		while(i<=n){
			int x=i;
			if(x%3==0){
				System.out.print(" "+i);
				i++;
				continue;
			}
			while(true){
				if(x%10==3){
					System.out.print(" "+i);
					break;
				}else {
					x/=10;
					if(x==0)break;
				}
			}
			i++;
		}
		System.out.println();
	}
}


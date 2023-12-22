import java.util.Scanner;
class Main{
    public static void main(String[] args){
		int a,b,c,cnt=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		for(int i=a;i<=b;i++){
			if(c%i==0){
				cnt++;
			}
		}
		System.out.println(cnt);
    }
}

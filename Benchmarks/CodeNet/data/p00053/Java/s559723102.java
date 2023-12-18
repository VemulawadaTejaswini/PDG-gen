import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==1){
				System.out.println(2);
				return;
			}
			int count=1;
			int sum=2;
			for(int i=3;count<n;i+=2){
				boolean flag=true;
				for(int j=2;j<Math.sqrt(i)+1;j++){
					if(i%j==0){
						flag=false;
						break;
					}
				}
				if(flag){
					sum+=i;
					count++;
				}
			}
			System.out.println(sum);
		}
	}
}
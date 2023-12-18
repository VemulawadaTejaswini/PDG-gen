import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int count=1;
			int n=sc.nextInt();
			if(n<=1){
				count=0;
			}
			for(int i=3;i<=n;i++){
				for(int j=2;j<i;j++){
					if(i%j==0){
						break;
					}else if(j==i-1){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
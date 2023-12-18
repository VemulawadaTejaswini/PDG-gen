import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int s=sc.nextInt();
			if((x==0&&y==0)&&s==0) break;
			int max=0;
			for(int i=0;i<s-1;++i){
				for(int j=0;j<s-1;++j){
					if((((i+1)*(100+x))/100)+(((j+1)*(100+x))/100)==s){
						int num=((i+1)*(100+y))/100+((j+1)*(100+y))/100;
						if(max<num) max=num;
					}
				}
			}
			System.out.println(max);
		}
	}
}

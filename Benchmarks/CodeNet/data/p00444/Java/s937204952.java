import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int coin=0;
			int c=1000-n;
			if(c>=500){
				c-=500;
				coin++;
			}
			for(int i=0;i<4;i++){
				if(c>=100){
					c-=100;
					coin++;
				}
			}
			if(c>=50){
				c-=50;
				coin++;
			}
			for(int i=0;i<9;i++){
				if(c>=10){
					c-=10;
					coin++;
				}
			}
			if(c>=5){
				c-=5;
				coin++;
			}
			for(int i=0;i<4;i++){
				if(c>=1){
					c-=1;
					coin++;
				}
			}
			System.out.println(coin);
		}
	}
}
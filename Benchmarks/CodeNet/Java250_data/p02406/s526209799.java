import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sr = new Scanner(System.in);
		int in = sr.nextInt();
		int x;
		for(int i=1;i<=in;i++){
			if(i%3==0){
				System.out.print(" "+i);
			}else if(i%10==3){
				System.out.print(" "+i);
			}else{
					x = i/10;
				while(x!=0){
					if(x%10==3){
						System.out.print(" "+i);
						break;
					}else{
						x = x/10;
					}
				}
			}
		}
		System.out.println();
	}
}
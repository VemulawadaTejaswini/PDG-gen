import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			int x=sc.nextInt();
			if(n==0&&x==0){
				break;
			}else{
				int count=0;
				if(x<6){
					System.out.println("0");
				}else{
					if(x-3>n){
						for(int i=n;i>x/3;i--){
							for(int j=i-1;j>1;j--){
								if(x-i-j<j){
									if(x-i-j>0){
									count++;
									}
								}else{
									break;
								}
							}
						}
					}else{
						for(int i=x-3;i>x/3;i--){
							for(int j=i-1;j>1;j--){
								if(x-i-j<j){
									if(x-i-j>0){
										count++;
									}
								}else{
									break;
								}
							}
						}						
					}
					System.out.println(count);
				}
			}
		}
	}
}
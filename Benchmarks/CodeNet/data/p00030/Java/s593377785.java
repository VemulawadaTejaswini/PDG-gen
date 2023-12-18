import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0)break;
			
			if(s>45 || n>10 || n==0){
				System.out.println("0");
			}else if(n==10){
				if(s>35 && s<46){
					System.out.println("1");
				}else{
					System.out.println("0");
				}
			}else{
				int count = 0;
				
				for(int a=0;a<10;a++){
					if(n==1){
						if(s==a)count++;
					}else for(int b=a+1;b<10;b++){
						if(n==2){
							if(s==a+b)count++;
						}else for(int c=b+1;c<10;c++){
							if(n==3){
								if(s==a+b+c)count++;
							}else for(int d=c+1;d<10;d++){
								if(n==4){
									if(s==a+b+c+d)count++;
								}else for(int e=d+1;e<10;e++){
									if(n==5){
										if(s==a+b+c+d+e)count++;
									}else for(int f=e+1;f<10;f++){
										if(n==6){
											if(s==a+b+c+d+e+f)count++;
										}else for(int g=f+1;g<10;g++){
											if(n==7){
												if(s==a+b+c+d+e+f+g)count++;
											}else for(int h=g+1;h<10;h++){
												if(n==8){
													if(s==a+b+c+d+e+f+g+h)count++;
												}else for(int i=h+1;i<10;i++){
													if(n==9){
														if(s==a+b+c+d+e+f+g+h+i)count++;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				System.out.println(count);
			}

		}
	}	
}
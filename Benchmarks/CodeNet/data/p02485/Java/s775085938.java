import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	while(true){
		int a = 0;
		int b = 0;
		int c = 0;
		int x = sc.nextInt();
		if(x == 0 || x > 9999){
			break;
			}
			else if(x < 10 && x > 0){
			System.out.printf("%d\n",x);
			}
			else if(x <100 && x >= 10){
				while(true){
					x = x-10;
					a++;
					if(x < 10){
						break;
					}
				}
				System.out.printf("%d\n",a+x);
			}
			else if(x < 1000 && x >= 100){
				while(true){
					x = x-100;
					b++;
					if(x < 100){
						break;
					}
				}
				while(true){
					if(x < 10){
						break;
					}
					x = x-10;
					a++;
				}
				System.out.printf("%d\n",a+b+x);
			}
			else if(x < 10000 && x >= 1000){
				while(true){
					x = x-1000;
					c++;
					if(x < 1000){
						break;
					}
				}
				while(true){
					if(x < 100){
						break;
					}
					x = x - 100;
					b++;
				}
				while(true){
					if(x < 10){
						break;
					}
					x = x - 10;
					a++;
				}
				System.out.printf("%d\n",a+b+c+x);
			}
			}
		System.out.print("");
		}
	}
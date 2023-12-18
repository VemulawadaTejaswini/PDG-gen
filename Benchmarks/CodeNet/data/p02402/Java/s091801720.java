import java.util.Scanner;
class Main {
	int n,x,i,max = -1000000,min = 1000000;
	long kei;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n == 0){
			max = 0;
			min = 0;
			kei = 0;
		}else if(n == 1){
			x = sc.nextInt();
			max = x;
			min = x;
			kei = x;
		}else if(n >= 2){
			for(i = 0;i < n;i++){
				x = sc.nextInt();
				if(min > x){
					min = x;
				}else if(max < x){
					max = x;
				}
				kei = kei + x;
			}
		}
		System.out.println(min + " " + max + " " + kei);
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}
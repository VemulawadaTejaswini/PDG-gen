import java.util.Scanner;
class Main {
	int n,x,i,max = -1000000,min = 1000000;
	long kei;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 0;i < n;i++){
			x = sc.nextInt();
			if(max < x){
				max = x;
			}else if(min > x){
				min = x;
			}
			kei = kei + x;
		}
		System.out.println(min + " " + max + " " + kei);
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int count = 0;
			int[] w = new int[10];
			do{
				w[count] = n % 2;
				n /= 2;
				count++;
			}while(n > 0);
			for(int i = 0;i < 10;i++){
				if(w[i] == 1){
					if(i == 9){
						System.out.println((int)Math.pow(2,i));
					}else{
						System.out.print((int)Math.pow(2,i) + " ");
					}
				}
			}
		}
	}
}
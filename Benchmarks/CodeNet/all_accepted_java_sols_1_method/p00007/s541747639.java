import java.util.Scanner;

class Main{	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int syakkin = 100000;
			for(int i=0;i<n;i++){
				syakkin *= 1.05;
				syakkin += 999;
				syakkin /= 1000;
				syakkin *= 1000;
				
			}
			System.out.println(syakkin);
		}
	}
}
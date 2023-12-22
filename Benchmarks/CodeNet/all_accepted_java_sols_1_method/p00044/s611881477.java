import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n,s,v;
		boolean is;

		while(sc.hasNextInt()){
			n = sc.nextInt();
			if(n == 0)break;
			s = 0;

			for(int i = 2; i < n; i++){
				is = true;

				for(int j = 2; j <= Math.sqrt(i); j++)
					if(i % j == 0){
						is = false;
						break;
					}

				if(is){
					s = Math.max(s, i);
				}
			}
			for(int i = n + 1; ; i++){
				is = true;

				for(int j = 2; j <= Math.sqrt(i); j++)
					if(i % j == 0){
						is = false;
						break;
					}
				if(is){
					v = i;
					break;
				}
			}
			System.out.println(s + " " + v);
		}
		sc.close();
	}
}
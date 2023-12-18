import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			while(true){
				long n =sc.nextInt();
				
					if(n == 0)
						break;
					long Max = 1;
					long Minflor = 999999999;
				for(int i=1;i<n;i++){
					long sum = 0;
					long a = 0;
					long flor = i;
					for(long j=i;;j++){
							if(sum >= n)
								break;
						sum += j;
						a++;
						if(sum == n && Max < a){
							Max = a;
						}
						if(sum == n && Minflor > flor)
							Minflor = flor;
					}
				}
				if(Max == 1)
					Minflor = n;
					System.out.println(Minflor + " " +Max);
				
			}
			sc.close();
	}

}

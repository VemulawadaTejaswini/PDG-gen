import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int a,b,c,d;
		int count = 0;
		for(a = 0; a < 10 ; a++){
			for(b = 0 ; b < 10 ; b++){
				for(c = 0 ; c < 10 ; c++){
					for(d = 0 ; d < 10 ; d++){
						if(sum == a+b+c+d){
							count++;
						}
					}
				}
			}
		}
		
		System.out.println(count);
		
		
		
		sc.close();
	}

}
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		int count = 0;
		while (sc.hasNext()){
		int sum = sc.nextInt();
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
		count = 0;
		}
		
		
		sc.close();
	}

}
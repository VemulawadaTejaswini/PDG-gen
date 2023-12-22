import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,count = 0,i = 0;
		int result[] = new int[1000];
		while(sc.hasNext()){
			n = sc.nextInt();
			for(int a = 0; a <10; a++){
				for(int b = 0; b < 10; b++){
					for(int c = 0; c < 10; c++){
						for(int d = 0; d < 10; d++){
							if(a+b+c+d == n) count++;
						}
					}
				}
			}
			result[i] = count;
			i++;
			count = 0;
		}
		for(int j = 0; j < i; j++){
			System.out.println(result[j]);
		}
	}
}
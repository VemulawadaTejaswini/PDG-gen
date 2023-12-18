import java.util.Scanner;
//import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

       while(sc.hasNext()){
            int a = sc.nextInt();
            int count = 0, save;
			int i;
			 
            if(a == 0){
				break;
			}

			while(a != 0){
				save = a % 10;
				count += save;
				a /= 10;
				if(a == 0){
					break;
				}
			}
			System.out.printf("%d\n",count);
		}
	}
}
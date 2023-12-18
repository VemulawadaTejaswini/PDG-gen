import java.util.Scanner;
//import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

       while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i, j;
 
            if(a==0 && b==0) break;
 
            for(i = 0; i < a; i++){
				if(i % 2 == 0){
                	for(j = 0; j < b; j++){
						if(j % 2 ==0){
                    		System.out.printf("#");
						}
						else{
							System.out.printf(".");
						}
                	}
				}
				else{
					for(j = 0; j< b; j++){
						if(j % 2 == 0){
							System.out.printf(".");
						}
						else{
							System.out.printf("#");
						}
					}
            }
            System.out.printf("\n");
			}
		System.out.printf("\n");
		}
	}
}
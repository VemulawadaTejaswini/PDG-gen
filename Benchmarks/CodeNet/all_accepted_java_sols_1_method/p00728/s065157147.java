import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		try(Scanner sc =new Scanner(System.in)){
			while(true){
				int num = sc.nextInt();
				if(num==0){
					break;
				}
				int max=0;
				int min=0;
				int sum=0; 
				for(int i=0; i<num; i++){
					int object = sc.nextInt();
					if(i==0){
						max = object;
						min = object;
					}
					sum += object;
					if(max < object){
						max = object;
					}
					if(min > object){
						min = object;
					}
				}
				sum = sum - max - min;
				sum = sum/(num-2);
				System.out.println(sum);
			}
			sc.close();
		}
	}
}

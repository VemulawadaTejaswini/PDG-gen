import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				float num = sc.nextFloat();
				float sum = num;
				for(int i = 1; i <10; i++){
					if(i%2!=0){
						float num2 = num*2;
						sum+=num2;
						num=num2;
					}else{
						float num2 = num /3;
						sum+=num2;
						num=num2;
					}
				}
			System.out.println(sum);
			}
		}
	}
	
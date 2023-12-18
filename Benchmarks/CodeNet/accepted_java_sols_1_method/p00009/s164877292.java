import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i,j;
		int count,num;
		boolean flag;
		
		while(scan.hasNextInt()){
			count = 0;
			num = scan.nextInt();
			if(num < 2){
				count = 0;
			}else if(num == 2){
				count = 1;
			}else{
				count = 1;
				
				for(i=3;i<=num;i+=2){
					flag = true;
					for(j=3;j<=Math.sqrt(i);j+=2){
						if(i%j == 0){
							flag = false;
							break;
						}
					}
					if(flag)
						count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int juice;
		int[] weight = new int[10];
		int count;
		boolean firstOut;
		String line;
		
		while(scan.hasNext()){
			juice = scan.nextInt();
			firstOut = false;
			count = 0;
			line = "";
			do{
				if(juice%2 == 1){
					weight[count] = 1;
				}else{
					weight[count] = 0;
				}
				count++;
				juice/=2;
			}while(juice > 0);
			
			for(int i=0;i<count;i++){
				if(weight[i]==1){
					line += (int)Math.pow(2,i);
					firstOut = true;
				}
				if(i < 9){
					if(firstOut && weight[i+1]==1){
						line += " ";
					}
				}
			}
			System.out.println(line);
		}
		scan.close();
	}
}
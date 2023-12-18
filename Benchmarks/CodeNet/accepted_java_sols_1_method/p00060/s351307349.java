import java.util.Scanner;
class Main {
	public static void main(String args[]){
		int[] card = new int[3];
		Scanner scan = new Scanner(System.in);
		int i;
		
		while(scan.hasNext()){
			for(i=0;i<3;i++){
				card[i] = scan.nextInt();
			}
			double y=0;
			for(i=1;i<=10;i++){
				if(i!=card[0] && i!=card[1] && i!=card[2]){
					if(card[0]+card[1]+i<=20){
						y++;
					}
				}
			}
			if(y/7*100 >= 50){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
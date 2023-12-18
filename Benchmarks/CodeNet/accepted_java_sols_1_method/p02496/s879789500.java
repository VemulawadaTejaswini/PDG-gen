import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,st;
		boolean cards[][] = new boolean[4][13];
		n = sc.nextInt();
		for (int i = 0 ; i < n ; i++){
			char c;
			int num;
			c = sc.next().charAt(0);
			num = sc.nextInt();
			st=0;
			if(c == 'S'){
				st = 0;
			}else if(c == 'H'){
				st = 1;
			}else if(c =='C'){
				st = 2;
			}else if(c =='D'){
				st = 3;
			}
			cards[st][num-1]=true;
		}
		for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                if(cards[i][j] != true){
                    if(i == 0){
                        System.out.println("S "+(j+1));
                    }else if(i==1){
                        System.out.println("H "+(j+1));
                    }else if(i==2){
                        System.out.println("C "+(j+1));
                    }else if(i==3){
                        System.out.println("D "+(j+1));
                    }
                }
            }
        }
	}
}
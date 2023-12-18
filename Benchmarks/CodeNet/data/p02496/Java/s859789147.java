import java.util.Scanner;
class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cards[][] = new int[4][13];
        String shcd[] = {"S","H","C","D"};
        for(int i = 0; i < n; i++){
            String Egara = sc.next();
            int rank = sc.nextInt() - 1;
            int a = 0;
            if(Egara.equals("H")){
            	a = 1;
            }else if(Egara.equals("C")){
            	a = 2;
            }else if(Egara.equals("D")){
            	a = 3;
            }
            cards[a][rank] = 1;
        }
        for(int i = 0; i < 4; i++){
        	for(int j = 0; j < 13; j++){
        		if(cards[i][j] == 0){
        			System.out.println(shcd[i] + " " + (j+1));
        		}
        	}
        }
	}
}
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);

		   int [][] ali = new int[4][13];
	        String Card[]= {"S","H","C","D"};

	        int yy = scan.nextInt();
	        String kk ;
	        int zz;
	        int i;
	        int q;
	        for(i = 0; i < yy ; i++){
	        	kk= scan.next();
	        	zz= scan.nextInt();
	        	if(kk.equals(Card[0])){
	        		q=0;
	        		ali[q][zz-1]=213;
	        	}else if(kk.equals(Card[1])){
	        		q=1;
	        		ali[q][zz-1]=213;
	        	}
	        	else if(kk.equals(Card[2])){
	        		q=2;
	        		ali[q][zz-1]=213;
	        	}
	        	else if(kk.equals(Card[3])){
	        		q=3;
	        		ali[q][zz-1]=213;
	        	}

	        }



	        for ( i= 0; i<4; i++){
	        	for (int j=0; j<13;j++){
	        		if  (ali[i][j]!= 213){
	        			System.out.println(Card[i]+ " " + (j +1));
	        		}
	        		}
	        	}
	        }

	}
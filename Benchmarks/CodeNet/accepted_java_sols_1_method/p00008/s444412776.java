import java.util.Scanner;

class Main{
    public static void main(String[] args){

    int match,num;
    Scanner s = new Scanner(System.in);

    while( s.hasNextInt() ){

        match=0;
        num=s.nextInt();

        for(int i=0;i<10;i++){
        	for(int j=0;j<10;j++){
        		for(int k=0;k<10;k++){
        			for(int l=0;l<10;l++){
        				if( num==i+j+k+l ){
        					match++;
        				}
        			}
        		}
        	}
        }

        System.out.println( match );

    }

    }
}
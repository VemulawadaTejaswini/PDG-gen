import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n,dice[]=new int[6],swap=0;
        String com;
        for(i=0;i<6;i++) {
        	dice[i]=scan.nextInt();
        }
        com=scan.next();
        n=com.length();
        for(i=0;i<n;i++) {
        	switch(com.charAt(i)) {
        		case 'N':
        			swap=dice[0];
        			dice[0]=dice[1];
        			dice[1]=dice[5];
        			dice[5]=dice[4];
        			dice[4]=swap;
        			break;
        		case 'E':
        			swap=dice[0];
        			dice[0]=dice[3];
        			dice[3]=dice[5];
        			dice[5]=dice[2];
        			dice[2]=swap;
        			break;
        		case 'W':
        			swap=dice[0];
        			dice[0]=dice[2];
        			dice[2]=dice[5];
        			dice[5]=dice[3];
        			dice[3]=swap;
        			break;
        		case 'S':
        			swap=dice[0];
        			dice[0]=dice[4];
        			dice[4]=dice[5];
        			dice[5]=dice[1];
        			dice[1]=swap;
        			break;
        		default:
        			break;
        	}
        }
        System.out.println(dice[0]);
    }
}

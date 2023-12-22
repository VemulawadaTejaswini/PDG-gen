import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n,card;
        int array[]=new int[52];
        String s;
        for(i=0;i<52;i++){
        	array[i]=0;
        }
        n=scan.nextInt();
        for(i=0;i<n;i++){
        	s=scan.next();
        	card=scan.nextInt();
        	switch(s){
        		case"S":
        			card-=1;
        			break;
        		case"H":
        			card+=12;
        			break;
        		case"C":
        			card+=25;
        			break;
        		case"D":
        			card+=38;
        			break;
        		default:
        			continue;
        	}
        	array[card]=1;
        }
        for(i=0;i<52;i++){
        	if(array[i]==0){
        		if(i/13==0){
        			System.out.println("S "+ (i%13+1));
        		}
        		else if(i/13==1){
        			System.out.println("H "+ (i%13+1));
        		}
        		else if(i/13==2){
        			System.out.println("C "+ (i%13+1));
        		}
        		else if(i/13==3){
        			System.out.println("D "+ (i%13+1));
        		}
        	}
        }
    }
}


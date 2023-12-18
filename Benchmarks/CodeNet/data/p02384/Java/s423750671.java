import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n,dice[]=new int[6],up,front;
        for(i=0;i<6;i++) {
        	dice[i]=scan.nextInt();
        }
        n=scan.nextInt();
        for(i=0;i<n;i++) {
        	up=scan.nextInt();
        	front=scan.nextInt();
        	if(up==dice[0]) {
        		if(front==dice[1]) {
        			System.out.println(dice[2]);
        		}
        		else if(front==dice[2]) {
        			System.out.println(dice[4]);
        		}
        		else if(front==dice[4]) {
        			System.out.println(dice[3]);
        		}
        		else if(front==dice[3]) {
        			System.out.println(dice[1]);
        		}
        	}
        	else if(up==dice[1]) {
        		if(front==dice[5]) {
        			System.out.println(dice[2]);
        		}
        		else if(front==dice[2]) {
        			System.out.println(dice[0]);
        		}
        		else if(front==dice[0]) {
        			System.out.println(dice[3]);
        		}
        		else if(front==dice[3]) {
        			System.out.println(dice[5]);
        		}
        	}
        	else if(up==dice[2]) {
        		if(front==dice[0]) {
        			System.out.println(dice[1]);
        		}
        		else if(front==dice[1]) {
        			System.out.println(dice[5]);
        		}
        		else if(front==dice[5]) {
        			System.out.println(dice[4]);
        		}
        		else if(front==dice[4]) {
        			System.out.println(dice[0]);
        		}
        	}
        	else if(up==dice[3]) {
        		if(front==dice[1]) {
        			System.out.println(dice[0]);
        		}
        		else if(front==dice[0]) {
        			System.out.println(dice[4]);
        		}
        		else if(front==dice[4]) {
        			System.out.println(dice[5]);
        		}
        		else if(front==dice[5]) {
        			System.out.println(dice[1]);
        		}
        	}
        	else if(up==dice[4]) {
        		if(front==dice[0]) {
        			System.out.println(dice[2]);
        		}
        		else if(front==dice[2]) {
        			System.out.println(dice[5]);
        		}
        		else if(front==dice[5]) {
        			System.out.println(dice[3]);
        		}
        		else if(front==dice[3]) {
        			System.out.println(dice[0]);
        		}
        	}
        	else if(up==dice[5]) {
        		if(front==dice[1]) {
        			System.out.println(dice[3]);
        		}
        		else if(front==dice[3]) {
        			System.out.println(dice[4]);
        		}
        		else if(front==dice[4]) {
        			System.out.println(dice[2]);
        		}
        		else if(front==dice[2]) {
        			System.out.println(dice[1]);
        		}
        	}
        }
    }
}

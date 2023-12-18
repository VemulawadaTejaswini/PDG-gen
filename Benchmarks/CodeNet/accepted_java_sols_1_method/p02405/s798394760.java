import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        	int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==0 && b==0) break;
        for (int i=0; i<a; i++) {
        		if(i%2 == 0) {
        			for(int j=0; j<b;j++) {
        				if(j%2 == 0) System.out.print("#");
            			if(j%2 == 1) System.out.print(".");
            			if(j == b-1) System.out.println();
        			}
        		} 
        		if(i%2 == 1) {
        			for(int j=0; j<b;j++) {
            			if(j%2 == 0) System.out.print(".");
            			if(j%2 == 1) System.out.print("#");
            			if(j == b-1) System.out.println();
        			}
        		}
        		if(i == a-1) System.out.println();
        }
        }
    }
}

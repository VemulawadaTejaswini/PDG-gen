
import java.util.Scanner;
class Main {

    //static char[] xx = new char[] {'S','H','C','D'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int box[][] = {{1,2,3,4,5,6,7,8,9,10,11,12,13},
        	{1,2,3,4,5,6,7,8,9,10,11,12,13},
        	{1,2,3,4,5,6,7,8,9,10,11,12,13},
        	{1,2,3,4,5,6,7,8,9,10,11,12,13}};

        for(int i = 0; i < n; i++) {
            String m = sc.next();
            int b = sc.nextInt();

            if(m.equals("S")) {
                box[0][b-1] = 0;
            }
            if(m.equals("H")) {
            	box[1][b-1] = 0;
            }
            if(m.equals("C")) {
            	box[2][b-1] = 0;
            }
            if(m.equals("D")) {
            	box[3][b-1] = 0;
            }
        }
        for(int i = 0 ; i< 4; i++) {
            for(int j = 0; j < 13; j++) {
                //if(!box[i][j]) {
            	if(box[i][j]!=0) {
            		if (i == 0)
                        System.out.println("S " + (j + 1));
                    else if (i == 1)
                        System.out.println("H " + (j + 1));
                    else if (i == 2)
                        System.out.println("C " + (j + 1));
                    else
                        System.out.println("D " + (j + 1));
            	}
            }
        }
        //System.out.println("");
    }
}

//Volume2-0222
import java.util.Scanner;

class Main {

    //declare
    private static final int       MAX = 10000001;
    private static       boolean[] prm = new boolean[MAX];
    private static       int    [] twn = new int    [MAX];

    public static void main(String[] arg){

        initialize();

        //input
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) != 0){

            //output
            System.out.println(twn[n]);
        }
    }

    private static void initialize(){

        //Creation of a prime number table.
        for(int i=0;i<MAX;i++){prm[i] = true;}
        prm[0] = false;
        prm[1] = false;
        for(int i=4;i<MAX;i+=2){prm[i] = false;}
        for(int i=3;i<MAX;i+=2){
            if(!prm[i]){continue;}
            for(int k=i*2;k<MAX;k+=i){
                prm[k] = false;
            }
        }

        //The table of a quadruplets prime number is created.
        int twin = -1;
        for(int i=13;i<MAX;i++){
            if(prm[i] && prm[i-2] && prm[i-6] && prm[i-8]){
                twin = i;
            }
            twn[i] = twin;
        }
    }
}
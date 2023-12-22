import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] A = new String[N+1];
        for (int i = 1 ; i <= N ; i++){
            A[i] = sc.next();
        }
        sc.close();

        int AC = 0;
        int WA = 0;
        int TLE = 0;
        int RE = 0;

        for(int i = 1 ; i<= N ; i++){
            if(A[i].equals("AC")){
                AC++;
            }
            else if(A[i].equals("WA")){
                WA++;
            }
            else if(A[i].equals("TLE")){
                TLE++;
            }
            else if(A[i].equals("RE")){
                RE++;
            }
        }
        System.out.println("AC x " + AC);
        System.out.println("WA x " + WA);
        System.out.println("TLE x " + TLE);
        System.out.println("RE x " + RE);

    }
}
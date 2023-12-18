import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for(int i=0; i<N; i++){
            S[i]=sc.next();
        }
        int AC = 0;
        int WA = 0;
        int TLE = 0;
        int RE = 0;

        for(int i=0; i<N; i++){
            if(S[i].equals("AC")){
                AC++;
                continue;
            }else if(S[i].equals("WA")){
                WA++;
                continue;
            }else if(S[i].equals("TLE")){
                TLE++;
                continue;
            }else if(S[i].equals("RE")){
                RE++;
                continue;
            }

        }

        System.out.println("AC x "+AC);
        System.out.println("WA x "+WA);
        System.out.println("TLE x "+TLE);
		System.out.println("RE x "+RE);
	}
}
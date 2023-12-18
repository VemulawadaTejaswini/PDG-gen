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
            if(S[i]=="AC"){
                AC++;
                continue;
            }else if(S[i]=="WA"){
                WA++;
                continue;
            }else if(S[i]=="TLE"){
                TLE++;
                continue;
            }else if(S[i]=="RE"){
                RE++;
                continue;
            }

        }

        System.out.println("AC × "+AC);
        System.out.println("WA × "+WA);
        System.out.println("TLE × "+TLE);
		System.out.println("RE × "+RE);
	}
}
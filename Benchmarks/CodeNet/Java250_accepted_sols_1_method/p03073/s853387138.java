import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        int[] sArray = new int[S.length()];
        int[] zeroArray = new int[S.length()];
        int[] oneArray = new int[S.length()];

        for(int i=0; i<sArray.length; i++){
            if(S.charAt(i) == '0'){
                sArray[i] = 0;
            }else{
                sArray[i] = 1;
            }

            if(i % 2 == 0){
                zeroArray[i] = 0;
                oneArray[i] = 1;
            }else{
                zeroArray[i] = 1;
                oneArray[i] = 0;
            }
        }

        int oneDiff = 0;
        int zeroDIff = 0;

        for(int i=0; i<sArray.length; i++){
            if(sArray[i] != oneArray[i]){
                oneDiff++;
            }

            if(sArray[i] != zeroArray[i]){
                zeroDIff++;
            }
        }

        System.out.println(Math.min(oneDiff, zeroDIff));
    }
}

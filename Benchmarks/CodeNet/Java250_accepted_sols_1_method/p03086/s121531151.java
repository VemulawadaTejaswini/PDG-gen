import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int maxCnt = 0;
        int cnt = 0;

        for(int c: str.toCharArray()){
            if(c == 'A' || c == 'T' || c == 'C' || c == 'G'){
                cnt++;
            }else{
                maxCnt = Math.max(maxCnt, cnt);
                cnt = 0;
            }
        }

        maxCnt = Math.max(maxCnt, cnt);

        System.out.println(maxCnt);

    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] cnt;
        int ch;
        cnt = new int[1000];
        Arrays.fill(cnt,0);
        Scanner sc = new Scanner(System.in);

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                for (int i=0;i< line.length();i++){
                    ch = Character.toLowerCase(line.charAt(i));
                    cnt[ch]++;
                }
        }
        for(int i='a'; i<='z';i++){
            System.out.printf("%c : %d\n",i,cnt[i]);
        }
    }
}
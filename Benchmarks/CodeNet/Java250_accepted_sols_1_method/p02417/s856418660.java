import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] cnt = new int[200];

        while(sc.hasNext()){
            String str = sc.next().toLowerCase();
            for(int i=0;i<str.length();i++){
                cnt[str.charAt(i)]++;
            }
        }

        for(char ch='a';ch<='z';ch++){
            System.out.println(ch+" : "+cnt[ch]);
        }


    }
}

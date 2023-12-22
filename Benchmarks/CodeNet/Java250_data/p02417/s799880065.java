import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = "";

        while(sc.hasNext()){
            String a = sc.nextLine();
            str = str + a;
        }

        int l = str.length();
        int[] num = new int[26];

        for(int i=0;i<l;i++){
            int c = (int)str.charAt(i);
            if('a'<=c && c<='z'){
                num[c-'a']++;
            }else if('A'<=c && c<='Z'){
                num[c-'A']++;
            }
        }

        for(int i=0;i<26;i++){
            System.out.printf("%c : %d\n", i+'a', num[i]);
        }
    }
}



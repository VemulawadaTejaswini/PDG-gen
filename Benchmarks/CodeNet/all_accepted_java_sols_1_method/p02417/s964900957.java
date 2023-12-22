import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] cnt = new int[26];
        while(sc.hasNext()){

            String str = sc.nextLine();
            str = str.toLowerCase();

            for(int i=0;i<str.length();i++){
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    cnt[str.charAt(i)-'a']++;
                }
            }
        }
        for(int i=0;i<26;i++){
            System.out.printf("%c : %d\n", i+'a',cnt[i]);
        }
        sc.close();
    }
}

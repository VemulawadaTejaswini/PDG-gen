import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int count[] = new int[26];
        while(scan.hasNextLine()) {
            String s = scan.nextLine();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if('a'<=c && c<='z'){
                    count[c-'a']++;
                }else if('A'<=c && c<='Z'){
                    count[c-'A']++;
                }
            }
        }
        for(int i=0;i<26;i++){
            System.out.printf("%c : %d\n",'a'+i,count[i]);
        }
    }
}


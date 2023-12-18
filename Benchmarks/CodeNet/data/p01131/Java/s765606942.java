import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] chars  = {
                {},
                {'.',',','!','?',' '},
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'},
                {'m','n','o'},
                {'p','q','r','s'},
                {'t','u','v'},
                {'w','x','y','z'}
        };

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String result = "";
            String s = scan.next();
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                if(c == '0'){
                    continue;
                }
                int count = 1;
                for(int k=1; ;k++){
                    if(s.charAt(j+k) == c){
                        count += 1;
                    } else {
                        break;
                    }
                }
                int number = Integer.parseInt(""+s.charAt(j));
                j += count-1;
                if(count != chars[number].length){
                    count %= chars[number].length;
                }
                result += chars[number][count-1];
            }
            System.out.println(result);
        }
    }
}
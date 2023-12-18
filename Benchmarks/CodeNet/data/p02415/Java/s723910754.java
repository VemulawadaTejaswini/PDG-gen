import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String sen;
        
        sen = sc.nextLine();

        int length = sen.length();
        for(int i=0; i<length; i++){
            char c = sen.charAt(i);
            if(c>= 'a' && c<='z'){
                c -= 32;
                sb.append(c);
            }else if(c >= 'A' && c <= 'Z'){
                c += 32;
                sb.append(c);
            }else{
                sb.append(c);
            }
        }

        System.out.println(sb);

        sc.close();

    }
}

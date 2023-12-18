import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String answer = "";
        int length = line.length();
        for(int i=0;i<length;i++){
            char ch = line.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch = (char)(ch - 32);
            }else if(ch>='A'&&ch<='Z'){
                ch = (char)(ch + 32);
            }
            answer += ch;
        }
        System.out.println(answer);
    }
}


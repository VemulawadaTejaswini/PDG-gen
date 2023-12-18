import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                System.out.print((char)(s.charAt(i)-'a'+'A'));
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                System.out.print((char)(s.charAt(i)+'a'-'A'));
            }
            else System.out.print(s.charAt(i));
        }
        System.out.println("");
    }
}


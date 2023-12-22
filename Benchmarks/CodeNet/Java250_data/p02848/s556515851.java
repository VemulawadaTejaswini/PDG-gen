import java.util.Scanner;

class Main{
    public static void main(String[] args){
        final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n;
        
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();
        String str = scan.next();
        scan.close();
        StringBuilder r = new StringBuilder();

        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            n = ALPHA.indexOf(c) + ch;
            if(n >= 26) n = n - 26;
            r.append(ALPHA.charAt(n));
        }
            String result = new String(r);   
            System.out.println(result);
    }
}
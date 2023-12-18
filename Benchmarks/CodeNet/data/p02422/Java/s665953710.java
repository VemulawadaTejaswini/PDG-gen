import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            String cmd = sc.next();

            if(cmd.equals("replace")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                String p = sc.next();
                String replaced;
                if(a == 0 && b == str.length() - 1)
                   replaced = str;
                else if(a == 0)
                    replaced = p + str.substring(b + 1, str.length() - 1);
                else if(b == str.length() - 1)
                    replaced = str.substring(0, a - 1) + p;
                else
                    replaced = str.substring(0, a - 1) + p + str.substring(b + 1);
                    str = replaced;
            }
            else if(cmd.equals("reverse")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                String reversed = null;
                for(int j = 0; j < a; j++)
                    reversed += str.charAt(j);
                for(int j = a; j <= b; j++)
                    reversed += str.charAt(b - (j - a));
                for(int j = b + 1; j < str.length(); j++)
                    reversed += str.charAt(j);
                str = reversed;
            }
            else{
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(str.substring(a, b + 1));
            }
        }
        sc.close();
    }
}


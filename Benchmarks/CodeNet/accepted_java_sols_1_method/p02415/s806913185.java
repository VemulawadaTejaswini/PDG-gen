import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c += 32;
                sb.append(c);
            }
            else if(Character.isLowerCase(c)){
                c -= 32;
                sb.append(c);
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        scan.close();
    }

}


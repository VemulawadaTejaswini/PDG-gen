import java.util.Scanner;
 public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int length = line.length();
        for(int i=0;i < length;i++){
            char ch = line.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
                System.out.printf("%c",ch);
            } else {
                ch = Character.toLowerCase(ch);
                System.out.printf("%c",ch);
            }
        }
        System.out.println("");
        scan.close();
    }
}

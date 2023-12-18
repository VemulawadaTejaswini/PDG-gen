import java.util.Scanner;
 
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                System.out.print(ch);
           }else{
                ch = Character.toLowerCase(ch);
                System.out.print(ch);
}
        }
        System.out.printf("\n");
    }
}

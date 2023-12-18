import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch[] = str.toCharArray();
        for(int i=0; i<=str.length()-1; i++){
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            } else if(Character.isLowerCase(ch[i])){
                ch[i] = Character.toUpperCase(ch[i]);
            }

        }
        System.out.println(ch);
    }
}

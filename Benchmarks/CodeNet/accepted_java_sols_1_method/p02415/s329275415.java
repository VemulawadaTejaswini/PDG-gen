import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i;
        char [] text = sc.nextLine().toCharArray();

        for(i = 0; i < text.length; i++) {
            if(text[i] >= 'A' && text[i] <= 'Z'){
                text[i] = (char)(text[i] + 0x20);
            }else if(text[i] >= 'a' && text[i] <= 'z'){
                text[i] = (char)(text[i] - 0x20);
            }
        }



        System.out.printf("%s\n",new String(text));
    }
}


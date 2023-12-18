import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        String answer="";
        int length=line.length();
        char ch;

        for(int i=0;i<length;i++){
            ch=line.charAt(i);
            if(Character.isLowerCase(ch)){
                ch=Character.toUpperCase(ch);
            }else{
                ch=Character.toLowerCase(ch);
            }
            answer+=ch;
        }

        System.out.println(answer);
    }
}

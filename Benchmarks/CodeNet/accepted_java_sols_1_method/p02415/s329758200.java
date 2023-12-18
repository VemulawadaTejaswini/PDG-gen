import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int length = line.length();
        for(int i=0;i<length;i++){
            char c = line.charAt(i);
            if(Character.isLowerCase(c)){
                char newc=Character.toUpperCase(c);
                System.out.print(newc);
            }else{
                char newc=Character.toLowerCase(c);
                System.out.print(newc);
            }
        }
        System.out.println("");
        sc.close();
    }
}

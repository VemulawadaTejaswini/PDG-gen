import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String word = sc.nextLine();
            if(word.equals(".")){
                break;
            }
            word = word.replaceAll("[a-zA-Z. ¥]","");
            while(!word.equals("")){
                String s =new String(word);
                word = word.replaceAll("\\(\\)|\\[\\]","");
                if(s.equals(word)){
                    break;
                }
            }
            if(word.equals("")){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}

import java.util.Scanner;                                                   

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String w = in.next();
        int a = 0;
        while(in.hasNext()){
            String str = in.next();
            if(str.equals("END_OF_TEXT")){
                break;
            }else if(str.equalsIgnoreCase(w)){
            a++;
            }
        }
        System.out.println(a);
    }
}
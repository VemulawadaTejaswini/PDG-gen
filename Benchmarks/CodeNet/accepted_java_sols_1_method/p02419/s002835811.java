import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w = sc.next().toLowerCase();
        int count = 0;

        while(true){
            String t = sc.next();
            if(t.equals("END_OF_TEXT")){
                break;
            }else if(t.toLowerCase().equals(w)){
                count++;
            }else{
            }
        }
        System.out.println(count);
    }
}


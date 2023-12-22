import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        int count=0;
        for(;;){
            String W=scan.next();
            if(W.equalsIgnoreCase(s)){
                count++;
            }
            if(W.equals("END_OF_TEXT")){
                break;
            }
        }
        System.out.println(count);

    }
}


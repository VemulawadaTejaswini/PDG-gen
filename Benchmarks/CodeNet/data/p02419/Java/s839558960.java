import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String W = sc.nextLine();
        String[] T;
        T = new String[1000];
        int i = 0;
        int count = 0;
        while(true){
            T[i] = sc.next();
            if(T[i].equals("END_OF_TEXT")){
                break;
            }
            if(T[i].equalsIgnoreCase(W)){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }    
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        // fill in the dictionary with the initial value
        String target = f.nextLine().toLowerCase();
        int count = 0;
        while(true){
            String temp = f.nextLine();
            if(temp.equals("END_OF_TEXT")){
                break;
            }
            String[] parts = temp.split(" ");
            for(String i : parts){
               
                if(i.toLowerCase().equals(target)) count++;
            }
        }
        System.out.println(count);
    }
}


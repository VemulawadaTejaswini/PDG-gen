
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int[] counts = new int[128];
            while(sc.hasNext()){
                String str = sc.nextLine().toLowerCase();

                for(int i=0;i<str.length();i++){
                    counts[str.charAt(i)]++;
                }
            }
            for(char ch = 'a'; ch<= 'z'; ch++){
                    System.out.println(ch+" : "+counts[ch]);
            }
        }
    }    
}

import java.util.Scanner;
public class Main{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W = new String(sc.nextLine());
        String T = new String();
        int word=0;
         
        while(true){
            T = sc.next();
            if(T.equals("END_OF_TEXT")){
                sc.close();
                break;
            }
            if(T.equalsIgnoreCase(W)){
                word++;
            }
        }
        
        System.out.println(word);
        
        sc.close();
    }
}


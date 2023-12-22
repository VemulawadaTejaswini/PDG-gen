import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] count;
        count = new int[128];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String sen="";
        String pass;

        while(sc.hasNext()){  
            pass = sc.nextLine();        
            sen += pass;
        }
        sen = sen.toLowerCase();
        sen = sen.replace(" ", "");

        for(int i=0; i<sen.length(); i++){
            count[sen.charAt(i)]++;
        }

        for(int i =97; i<=122;i++){
            System.out.println(alpha.charAt(i-97) +" : "+ count[i]);
        }


        sc.close();

    }
}

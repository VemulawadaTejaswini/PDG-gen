import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        while(true){
            String str = scn.nextLine();

            if(str.equals(".")) break;

            str = str.replaceAll("[a-z A-Z \\.]","");

            while(true){
                String st = str;
                str = str.replaceAll("\\(\\)|\\[\\]","");
                if(st.equals(str)) break;
            }
            if(str.equals("")) System.out.println("yes");
            else System.out.println("no");
        }
    }
}


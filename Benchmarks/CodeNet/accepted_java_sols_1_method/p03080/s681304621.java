import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String str = scan.next();
        String[] strArray = new String[str.length()];
        String r = "R";
        int redcount = 0;
        int bulecount = 0;

        for (int i = 0; i < str.length(); i++) {
            String str2 = String.valueOf(str.charAt(i));
            strArray[i] = str2;

            if(strArray[i].equals(r)){
                redcount++;
            }
            
            else{
                bulecount++;
            }

        }

        if((redcount - bulecount) > 0){            
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

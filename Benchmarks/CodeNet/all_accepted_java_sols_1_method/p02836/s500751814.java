import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int res = 0;
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();

        if (text.length()%2 == 0){
            for (int i=0; i<text.length()/2; i++){
                if (text.charAt(i)!=text.charAt(text.length()-1-i))
                    res += 1;
                else
                    continue;
            }
        }else{
            for (int i=0; i<text.length()/2; i++){
                if (text.charAt(i)!=text.charAt(text.length()-1-i))
                    res += 1;
                else
                    continue;
            }
        }
        System.out.println(res);
    }
}
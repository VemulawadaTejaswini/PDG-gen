import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String regex = "s\\Z";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        if(m.find()){
            System.out.println(s + "es");
        }
        else{
            System.out.println(s + "s");
        }
    }

}

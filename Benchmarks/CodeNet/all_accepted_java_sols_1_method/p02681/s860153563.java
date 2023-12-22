import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        for(int i = 0; i < 26; i++){
            boolean b = false;
            
            switch(i){
                case 0:
                    b = (t.equals(s + "a"));
                    break;
                case 1:
                    b = (t.equals(s + "b"));
                    break;
                case 2:
                    b = (t.equals(s + "c"));
                    break;
                case 3:
                    b = (t.equals(s + "d"));
                    break;
                case 4:
                    b = (t.equals(s + "e"));
                    break;
                case 5:
                    b = (t.equals(s + "f"));
                    break;
                case 6:
                    b = (t.equals(s + "g"));
                    break;
                case 7:
                    b = (t.equals(s + "h"));
                    break;
                case 8:
                    b = (t.equals(s + "i"));
                    break;
                case 9:
                    b = (t.equals(s + "j"));
                    break;
                case 10:
                    b = (t.equals(s + "k"));
                    break;
                case 11:
                    b = (t.equals(s + "l"));
                    break;
                case 12:
                    b = (t.equals(s + "m"));
                    break;
                case 13:
                    b = (t.equals(s + "n"));
                    break;
                case 14:
                    b = (t.equals(s + "o"));
                    break;
                case 15:
                    b = (t.equals(s + "p"));
                    break;
                case 16:
                    b = (t.equals(s + "q"));
                    break;
                case 17:
                    b = (t.equals(s + "r"));
                    break;
                case 18:
                    b = (t.equals(s + "s"));
                    break;
                case 19:
                    b = (t.equals(s + "t"));
                    break;
                case 20:
                    b = (t.equals(s + "u"));
                    break;
                case 21:
                    b = (t.equals(s + "v"));
                    break;
                case 22:
                    b = (t.equals(s + "w"));
                    break;
                case 23:
                    b = (t.equals(s + "x"));
                    break;
                case 24:
                    b = (t.equals(s + "y"));
                    break;
                case 25:
                    b = (t.equals(s + "z"));
                    break;
            }
            if(b){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}
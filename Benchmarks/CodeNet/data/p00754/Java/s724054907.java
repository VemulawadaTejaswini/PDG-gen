import java.util.Scanner;

class Content{
    private String str;

    private static char bracketComp(char in){
        if (in == '(') return ')';
        return ']';
    }

    public Content(String s){
        str = s;
    }

    public boolean balanced(){
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++){
            if (array[i] == '(' || array[i] == '['){
                String tmp = "";
                Boolean bal = false;
                int skip = 0;
                for (int j = i + 1; j < array.length; j++){
                    if (array[j] == bracketComp(array[i]) && skip-- == 0){
                        bal = true;
                        i = j;
                        break;
                    }
                    else if (array[j] == array[i]) skip++;
                    tmp += array[j];
                }
                if (!bal) return false;
                Content inContent = new Content(tmp);
                if (!inContent.balanced()) return false;
            }
            else if (array[i] == ')' || array[i] == ']') return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String line = sc.nextLine();
            if (line.equals(".")) break;
            Content cont = new Content(line);
            if (cont.balanced()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
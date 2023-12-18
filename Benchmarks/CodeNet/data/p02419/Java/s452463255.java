import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String w = scan.nextLine();
        String t = scan.nextLine();
        String add = scan.nextLine();
        int sum = 0;
        while (!add.equals("END_OF_TEXT")){
            t = t +  add;
            add = scan.nextLine();
        }
        t = t.replaceAll(" ", "");

        for(int x = 0; x < t.length(); x++){
            if(t.charAt(x) == w.charAt(0)){
                for(int y = 1; y < w.length(); y++){
                    x++;
                    if(x == t.length()){
                        y = w.length();
                    }
                    else if(y== w.length() - 1) {
                        if (Character.toString(t.charAt(x)).equalsIgnoreCase(Character.toString(w.charAt(y)))){
                            sum++;
                        }
                    }
                    else if(Character.toString(t.charAt(x)).equalsIgnoreCase(Character.toString(w.charAt(y)))){

                    }
                    else{
                        y = w.length();
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        String checked = s + s.substring(0, p.length() - 1);
        String result = "No";
        if(checked.contains(p)) result="Yes";
        System.out.println(result);
    }
}


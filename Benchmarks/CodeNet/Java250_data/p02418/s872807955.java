import java.util.Scanner;
class Main{
    public static void next(String s, int index, String p){
        int i;
        for(i = 1; i < p.length(); i++){
            int sub2 = (index+i)%s.length();
            if(s.charAt(sub2) != p.charAt(i))break;
        }
        if(i == p.length()){
            System.out.println("Yes");
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s, pattern;
        s = scanner.nextLine();
        pattern = scanner.nextLine();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == pattern.charAt(0))next(s, i, pattern);
        }
        System.out.println("No");
    }
}


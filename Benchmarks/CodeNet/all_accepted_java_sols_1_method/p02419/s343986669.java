import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder(sc.nextLine());
        while(true){
            String s = sc.nextLine();
            if(s.equals("END_OF_TEXT")) break;
            sb.append(" ").append(s);
        }
        int cnt = 0;
        String[] str = sb.toString().toLowerCase().split(" ");
        for(int i = 0,l = str.length;i < l;++i){
            if(str[i].equals(w)) ++cnt;
        }
        System.out.println(cnt);
    }

}
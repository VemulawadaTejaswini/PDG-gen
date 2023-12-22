import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int where = Integer.parseInt(in[1])-1;
        String t = s.nextLine();
        String r = "";
        int i=0;
        for(char c:t.toCharArray()){
            if(i == where){
                r += String.valueOf(c).toLowerCase();
            }else {
                r += c;
            }
            i++;
        }
        System.out.println(r);
    }
}
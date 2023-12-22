import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = -1;
        String[] ss = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for(int i = 0; i < ss.length; i++){
            if (ss[i].equals(s)){
                index = i;
                
            }
        }
        System.out.println( 7 - index);
    }
}
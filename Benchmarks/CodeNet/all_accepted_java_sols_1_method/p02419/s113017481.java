import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int count = 0;
        while (sc.hasNext()) {
            String str = sc.next();
            if (str.equals("END_OF_TEXT")){
                break;
            }
            if (str.compareToIgnoreCase(text) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

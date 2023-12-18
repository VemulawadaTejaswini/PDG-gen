import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int taro = 0;
        int hanako = 0;
        for(int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            String[] ani = line1.split(" ");
            if(ani[0].compareTo(ani[1]) < 0) {
                hanako += 3;
            } else if(ani[1].compareTo(ani[0]) < 0) {
                taro += 3;
            }else if(ani[1].compareTo(ani[0]) == 0) {
                taro += 1;
                hanako += 1;
            }
        }
        System.out.println(taro + " " + hanako);

    }
 }

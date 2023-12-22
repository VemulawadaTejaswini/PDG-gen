import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] str = line.toCharArray();

        line = sc.nextLine();
        int n = Integer.parseInt(line);

        for(int i = 0; i < n; i++) {
          line = sc.nextLine();
          String[] l = line.split(" ");
          String command = l[0];
          int start = Integer.parseInt(l[1]);
          int target = Integer.parseInt(l[2]);

          int len = target - start + 1;
          char[] tmp = new char[len];
          if(command.equals("replace")) {
            char rep[] = l[3].toCharArray();
            for(int j = 0; j < len; j++) {
              str[j + start] = rep[j];
            }
          } else if(command.equals("reverse")) {
            for(int j = 0; j < len; j++) {
              tmp[j] = str[j + start];
            }
            for(int j = 0; j < len; j++) {
              str[target - j] = tmp[j];
            }
          } else if(command.equals("print")) {
            for(int j = 0; j < len; j++) {
              tmp[j] = str[j + start];
            }
            System.out.println(String.valueOf(tmp));
          }

        }

    }
}
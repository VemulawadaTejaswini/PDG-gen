import java.util.*;

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int res = 0;

        while(sc.hasNext()) {
            char[] line = sc.nextLine().toCharArray();
            boolean palind = true;
            for(int i = 0; i < line.length; i++) {
                if (line[i] != line[line.length - i - 1]) {
                    palind = false;
                    break;
                }
            }

           if(palind)   res += 1; 
        }

        System.out.println(res);

    }
}
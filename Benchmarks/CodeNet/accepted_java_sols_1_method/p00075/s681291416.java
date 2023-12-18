

import java.util.Scanner;

class Main {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
           String[] s = scanner.nextLine().split(",");
           int si = Integer.parseInt(s[0]);
           double wi = Double.parseDouble(s[1]);
           double hi = Double.parseDouble(s[2]);

            if (wi/Math.pow(hi,2) >= 25){
                System.out.println(si);
            }
        }
    }
}


import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] linesp = line.split("");
        for(int i = 0; i < linesp.length; i++) {
            if(Character.isUpperCase(line.charAt(i))) {
                System.out.print(linesp[i].toLowerCase());
            }else {
                System.out.print(linesp[i].toUpperCase());
            }
        }
         System.out.println("");
    }
}

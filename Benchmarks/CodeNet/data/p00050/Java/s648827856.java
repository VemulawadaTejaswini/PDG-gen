import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
 
            String s = null;
            while (sc.hasNext()) {
                s = sc.nextLine();
                
                s = s.replaceAll("apple", "XXXXX");
                s = s.replaceAll("peach", "apple");
                s = s.replaceAll("XXXXX", "peach");
 
                System.out.println(s);
            }
        } finally {
            sc.close();
        }
    }
}
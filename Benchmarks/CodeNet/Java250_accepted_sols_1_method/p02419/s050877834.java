import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int count = 0;
        char c;
        String word, temp;
        Scanner sc = new Scanner(System.in);
        word = sc.next();
        temp = sc.next();
        
        while (!temp.equals("END_OF_TEXT")) {
            if (temp.equalsIgnoreCase(word)) 
                count++;
            temp = sc.next();
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] check = { "this", "that", "the" };
        while (sc.hasNext()) {
            String str = sc.nextLine();
            end: for (int i = 0; i < 26; i++) {
                for (String t : check) {
                    if (str.contains(t)) {
                        System.out.println(str);
                        break end;
                    }
                }
                String temp = "";
                for (char c : str.toCharArray()) {
                    if (c >= 'a' && c <= 'z')
                        c = (char) (c == 'z' ? 'a' : c + 1);
                    temp += c;
                }
                str = temp;
            }
        }
    }
}

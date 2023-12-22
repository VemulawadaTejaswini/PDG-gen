import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] atoz = new int[26];
   
        do {
            String s = sc.nextLine();
            for (char c : s.toCharArray()){
                if ((c < 'A' || 'Z' < c) && (c < 'a' || 'z' < c)) continue;
                atoz[Character.toLowerCase(c)- 'a']++;
            }
        } while (sc.hasNext());
   
        for (char c = 'a'; c <= 'z'; c++){
            System.out.println(c + " : " + atoz[c - 'a']);
        }
    }
}


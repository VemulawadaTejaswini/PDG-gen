import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        String str = scan.nextLine();
        int[] alp = new int[26]; // ????????????????????°???????´?????????????
        for(int i = 0; i < alp.length; i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(i == Character.toLowerCase(str.charAt(j)) - 'a'){
                    count++;
                }   
                alp[i] = count;
            }
        }
        System.out.println();
        char[] alpStr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i = 0; i < alp.length; i++){
            System.out.println(alpStr[i] + " : " + alp[i]);
        }
    }
}
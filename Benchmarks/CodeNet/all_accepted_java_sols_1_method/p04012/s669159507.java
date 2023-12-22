import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i] %2!=0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            sb.append(sc.next());
        }
        int[] nums = new int[26];
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 65 && ch <= 90) nums[ch - 65]++;
            else if(ch >= 97 && ch <= 122) nums[ch - 97]++;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(String.format("%c : %d", (char)(i + 97), nums[i]));
        }
    }
}


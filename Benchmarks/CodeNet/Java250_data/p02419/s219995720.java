import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String BREAKW="END_OF_TEXT";
        int count=0;
        String ans = "";
        while(true) {
            String str =sc.nextLine();
            if(str.equals(BREAKW))break;
            ans = ans +" "+str;
        }

        String word[] = ans.split(" ");
        for(int i=0;i<word.length;i++) {
        	if(word[i].equalsIgnoreCase(key))count++;
        }
         System.out.println(count);
        sc.close();
    }
}

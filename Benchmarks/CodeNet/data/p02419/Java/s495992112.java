import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s.toLowerCase();
        int n=s.length();
        int ans=0;
        while(true){
            String t=sc.nextLine();
            if(t.equals("END_OF_TEXT")) break;
            for(String u:t.toLowerCase().split(" ")){
                if(s.equals(u)) ans++;
            }
        }
        System.out.println(ans);
    }
}

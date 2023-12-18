import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] count=new int[26];
        String s;
        char c;
        int p;
        while(sc.hasNextLine()){
            s=sc.nextLine().toLowerCase();
            for(int i=0;i<s.length();i++){
                c=s.charAt(i);
                p=(int)(c-'a');
                if(p>=0&&p<=25){
                    count[p]++;
                }
            }
        }
        for(int i=0;i<26;i++){
            s=""+(char)(i+'a')+" : ";
            System.out.println(s+count[i]);
        }
    }
}
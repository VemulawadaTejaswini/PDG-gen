import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String li[]=line.split("",0);
        boolean b[]=new boolean[26];
        String s="qwertyuiopasdfghjklzxcvbnm";
        String ss[]=s.split("",0);
        for(int i=0;i<li.length;i++){
            for(int j=0;j<26;j++){
                if(ss[j].equals(li[i])){
                    b[j]=!b[j];
                    break;
                }
            }
        }
        boolean f=true;
        for(int i=0;i<26;i++){
            if(b[i]){
                f=false;
                break;
            }
        }
        if(f)System.out.println("Yes");
        else System.out.println("No");
    }
}
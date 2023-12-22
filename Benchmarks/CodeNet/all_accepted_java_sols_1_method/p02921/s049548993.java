import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String a = scn.next();
        String b = scn.next();
        int cnt=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)) cnt++;
        }
        System.out.println(cnt);
    }
}
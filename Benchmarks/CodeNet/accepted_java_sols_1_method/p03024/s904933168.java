//https://atcoder.jp/contests/m-solutions2019/tasks/m_solutions2019_b

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int win = 0;
        for (int i=0;i<S.length();i++){
            if (String.valueOf(S.charAt(i)).equals("o")){
                win++;
            }
        }
        if (win>7 || win+(15-S.length())>7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
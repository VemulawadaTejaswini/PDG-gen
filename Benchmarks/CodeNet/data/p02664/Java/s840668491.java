import java.util.*;



import java.lang.*;
public class Main{

    public static int counterpost(char[] ch){
        int ctr = 0;
        // if(ch[0] == 'D')ctr++;
        for(int i = 1 ; i < ch.length ; i++){
            if(ch[i] == 'D'){
                
                if(ch[i-1] == 'P')ctr++;
            }
        }
        return ctr;
    }

    public static int counterpostdoc(char[] ch){
        int ctr = 0;
        if(ch[0] == 'D')ctr++;
        for(int i = 1 ; i < ch.length ; i++){
            if(ch[i] == 'D'){
                ctr++;
                if(ch[i-1] == 'P')ctr++;
            }
        }
        return ctr;
    }

    public static int counter(char ch[]){
        int ctr = 0;
        if(ch[0] == 'D')ctr++;
        for(int i = 1 ; i < ch.length ; i++){
            if(ch[i] == 'D'){
                ctr++;
            }
        }
        return ctr;
    }

    static int tol1 = 0;
    static String ans = "";
    static int pd = 0;
    static int d = 0;
    public static void helper(char ch[] , int idx ){
        if(idx == ch.length){
            int doc = counter(ch);
            int pdo = counterpost(ch);
            int tol = counterpostdoc(ch);
            if(tol > tol1){
                ans = String.valueOf(ch);
                tol1 = tol;
            }else if(tol == tol1){
                if(pdo > pd){
                    pd = pdo;
                    ans = String.valueOf(ch);
                }else if(doc > d){
                    doc = d;
                    ans = String.valueOf(ch);
                }
            }
            return;
        }
        if(ch[idx] != '?')
        helper(ch , idx + 1);
        else{
            ch[idx] = 'D';
            helper(ch ,idx + 1);
            ch[idx] = 'P';
            helper(ch , idx + 1);
            ch[idx] = '?';
        }
    }

    public static String solve(String str){
        
        if(str.length() == 1 && str.charAt(0) == '?') return "D";
        
        char ch[] = str.toCharArray();
        helper(ch, 0);
        return ans;
    }


    public static void gora(){
        Scanner scn = new Scanner(System.in);
        
        // int test = scn.nextInt();

        // while(test-- > 0){
            String str = scn.nextLine();
            System.out.println(solve(str));
        // }
    }

    public static void main(String args[]){
        gora();
    }
}